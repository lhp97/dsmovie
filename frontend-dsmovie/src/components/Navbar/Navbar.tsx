import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './Navbar.css';

function Navbar() {
    return (
        <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DsMovie</h1>
            <a href="https://github.com/lhp97" target="_blank" rel="noreferrer">
              <div className="dsmovie-contact-container">
                <GithubIcon className="dsmovie-github-icon"/>
                <p className="dsmovie-contact-link">/lhp97</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;