function Header(black) {
  return (
    <header className={black ? 'black' : ''}>
        <div className="header__logo">
          <a href="/">
            <img src="" alt="logo_netflix"/>
          </a>
        </div>

        <div className="header__logo">
          <a href="/">
            <img src="" alt="user_netflix" />
          </a>
        </div>
    </header>
  )
}

export default Header