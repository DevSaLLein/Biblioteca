/* eslint-disable react/prop-types */
function MovieList(title, items) {
  return (
    <div className="movies">
      <h2>{title}</h2>

      <div className="movies__container">

        <div className="movies__view">
          {
            items.results.length > 0 && items.map((item, key) => {
              <div key={key} className="movies-infos">
                <img src={`htpps://image.tmdb.org/t/p/w300${item.poster_path}`} alt={item.original.title} />
              </div>
            })
          }
        </div>
      </div>
    </div>
  )
}

export default MovieList