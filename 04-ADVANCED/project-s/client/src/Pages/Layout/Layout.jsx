import {useContext} from "react";
import {Link, Outlet} from "react-router-dom";
import {AuthContext} from "../../components/AuthContext/AuthContextProvider";

function logout() {
    localStorage.removeItem("jwt");
}

const Layout = () => {
    const {isLoggedIn, setIsLoggedIn} = useContext(AuthContext);
    return (<>
            <nav className="bg-gray-800 h-16">
                <div className="max-w-screen-xl flex flex-wrap items-center justify-between mx-auto p-4">
                    <Link to="/">
                        <p className="text-gray-50 font-bold text-xl">Project - S</p>
                    </Link>
                    {!isLoggedIn ?
                        <div className="flex">
                            <Link to="/login">
                                <button type="button"
                                        className="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Login
                                </button>
                            </Link>
                            <Link to="/register">
                                <button type="button"
                                        className="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Register
                                </button>
                            </Link>
                        </div>
                        : <div>
                            <Link to="/">
                                <button
                                    onClick={() => {
                                        logout();
                                        setIsLoggedIn(false);
                                    }}
                                    className="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium"
                                >Logout
                                </button>
                            </Link>
                            <Link to="/posts">
                                <button type="button"
                                        className="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">All
                                    Posts
                                </button>
                            </Link>
                            <Link to="/create">
                                <button type="button"
                                        className="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Create
                                    Post
                                </button>
                            </Link>
                        </div>}
                </div>
            </nav>
            <Outlet/>
        </>
    )
};

export default Layout;
