import './form.css'

function Form() {

    const movie = {
        id: 1,
        image: "https://occ-0-3934-114.1.nflxso.net/dnm/api/v6/6AYY37jfdO6hpXcMjf9Yu5cnmO0/AAAABVWS9pqT4D1VP8vlUp4tpjXcO0T2xb7QHYJAZgmwalMcwqgHKJNUEZdbgwOrydpkKgTrgA-hRPGQh5XYsNydSOMvYCsV1Vnm808M.jpg?r=93a",
        title: "The Witcher",
        count: 2,
        score: 4.5
    };

    return (
        <div className="dsmovie-form-container">
            <img className="dsmovie-card-image" src={movie.image} alt={movie.title} />
            <div className="dsmovie-card-bottom-container">
                <h3>{movie.title}</h3>
                <form className="dsmovie-form">
                    <div className="form-group dsmovie-form-group">
                        <label htmlFor="email">Informe seu email</label>
                        <input type="email" className="form-control" id="email"/>
                    </div>
                    <div className="form-group dsmovie-form-group">
                        <label htmlFor="score">Informe sua Avaliação</label>
                        <select className="form-control" id="score">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                    <div className="dsmovie-form-btn-container">
                        <button type="submit" className="btn btn-primary dsmovie-btn">Salvar</button>
                    </div>
                </form>
                <button className="btn btn-primary dsmovie-btn mt-3">Cancelar</button>
            </div>
        </div>
    )
}

export default Form;