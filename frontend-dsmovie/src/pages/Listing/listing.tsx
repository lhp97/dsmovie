import MovieCard from "components/MovieCard/movieCard";
import Pagination from "components/Pagination/pagination";

function Listing() {
  return (
    <div>
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
