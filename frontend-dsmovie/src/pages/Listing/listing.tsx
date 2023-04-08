import axios from "axios";
import MovieCard from "components/MovieCard/movieCard";
import Pagination from "components/Pagination/pagination";
import { useState, useEffect } from "react";
import { MoviePage } from "types/movie";
import { BASE_URL } from "utils/request";

function Listing() {

  const [pageNumber, setPageNumber] = useState(0);

  useEffect(() => {
    axios.get(`${BASE_URL}/movies?size=12&page=0`).then((response) => {
      const data = response.data as MoviePage;
      console.log(data)
      setPageNumber(data.number);
    });
  }, []);

  return (
    <div>
      <p>{pageNumber}</p>
      <Pagination />
      <div className="container">
        <div className="row">
          <div className="col-sm-6 col-lg-4 col-xl-3 mb-3">
            <MovieCard />
          </div>
        </div>
      </div>
    </div>
  );
}

export default Listing;
