import MovieScore from "components/MovieScore/movieScore";
import { Link } from "react-router-dom";

function MovieCard() {
  const movie = {
    id: 1,
    image:
      "https://occ-0-3934-114.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABVWS9pqT4D1VP8vlUp4tpjXcO0T2xb7QHYJAZgmwalMcwqgHKJNUEZdbgwOrydpkKgTrgA-hRPGQh5XYsNydSOMvYCsV1Vnm808M.jpg?r=93a",
    title: "The Witcher",
    count: 2,
    score: 4.5,
  };

  return (
    <div>
      <img className="dsmovie-movie-card-image" src={movie.image} alt={movie.title} />
      <div className="dsmovie-card-bottom-container">
        <h3>{movie.title}</h3>
        <MovieScore />
        <Link to={`form/${movie.id}`}>
          <div className="btn btn-primary dsmovie-btn">Avaliar</div>
        </Link>
      </div>
    </div>
  );
}

export default MovieCard;
