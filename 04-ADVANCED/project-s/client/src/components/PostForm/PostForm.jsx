import React from 'react';


const PostForm = ({disabled, onCancel, onSave}) => {

    const onSubmit = (e) => {
        e.preventDefault();
        const formData = new FormData(e.target);
        const entries = [...formData.entries()];
        console.log(entries)

        const post = entries.reduce((acc, entry) => {
            const [key,value] = entry;
            acc[key] = value;
            return acc;
        }, {})
        return onSave(post);
    }
    return (
        <div className="w-full lg:w-4/12 px-4 mx-auto pt-6">
            <div className="relative flex flex-col min-w-0 break-words w-full mb-6 shadow-lg rounded-lg bg-blueGray-200 border-0">
                <div className="rounded-t mb-0 px-6 py-6">
                    <div className="text-center mb-3">
                        <h6 className="text-blueGray-500 text-sm font-bold">New Post</h6>
                    </div>
                </div>
                <div className="flex-auto px-4 lg:px-10 py-10 pt-0">
                    <form onSubmit={onSubmit}>
                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">Name: </label>
                            <input
                                name={"userName"}
                                required={true}
                                placeholder={"Name"}
                                type={"text"}
                                className="border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                            />
                        </div>

                        <div className="relative w-full mb-3">
                            <label className="block uppercase text-blueGray-600 text-xs font-bold mb-2">Content: </label>
                            <textarea
                                name={"content"}
                                required={true}
                                placeholder={"Message"}
                                className="border-0 px-3 py-3 h-60 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150"
                            />
                        </div>

                        <div className="text-center mt-6">
                            <button type="submit" disabled={disabled}
                                    className="bg-gray-800 text-white active:bg-gray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150">
                                {/*{post ? "Update Employee" : "Create Employee"}*/}
                                Create Post
                            </button>

                            <button type="button" onClick={onCancel}
                                    className="bg-gray-800 text-white active:bg-gray-600 text-sm font-bold uppercase px-6 py-3 rounded shadow hover:shadow-lg outline-none focus:outline-none mr-1 mb-1 w-full ease-linear transition-all duration-150">
                                Cancel
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    )
}

export default PostForm;