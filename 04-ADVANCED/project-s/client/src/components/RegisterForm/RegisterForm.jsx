import React from 'react';

const RegisterForm = ({onCancel, onRegister}) => {
    const onSubmit = (e) => {
        e.preventDefault();
        const formData = new FormData(e.target);
        const entries = [...formData.entries()];
        console.log(entries)

        const register = entries.reduce((acc, entry) => {
            const [key, value] = entry;
            acc[key] = value;
            return acc;
        }, {})
        return onRegister(register);
    }

    return (
        <div className="w-full lg:w-4/12 px-4 mx-auto pt-6">
            <div className="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200 border-0">
                <div className="rounded-t mb-0 px-6 py-6">
                    <div className="text-center mb-3">
                        <h6 className="text-blueGray-500 text-sm font-bold">Sign in</h6>
                    </div>
                </div>
                <div className="flex-auto px-4 lg:px-10 py-10 pt-0">
                    <form onSubmit={onSubmit}>
                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">First name: </label>
                            <input
                                name={"firstname"}
                                required={true}
                                placeholder={"Max"}
                                type={"text"}
                                className="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"

                            />
                        </div>

                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">Last name: </label>
                            <input
                                name={"lastname"}
                                required={true}
                                placeholder={"Muster"}
                                type={"text"}
                                className="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"

                            />
                        </div>

                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">Email: </label>
                            <input
                                name={"email"}
                                required={true}
                                placeholder={"test@gmail.com"}
                                type={"email"}
                                className="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"

                            />
                        </div>

                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">Password: </label>
                            <input
                                name={"password"}
                                required={true}
                                placeholder={"Password"}
                                type={"password"}
                                className="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"

                            />
                        </div>

                        <div className="text-center mt-6">
                            <button type="submit"
                                    className="bg-gray-800 text-white active:bg-gray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150">
                                Register
                            </button>

                            <button type="button" onClick={onCancel} className="bg-gray-800 text-white active:bg-gray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150">
                                Cancel
                            </button>
                        </div>

                    </form>
                </div>
            </div>
        </div>
    );
}
export default RegisterForm;