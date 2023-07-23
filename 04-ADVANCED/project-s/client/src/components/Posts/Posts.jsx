const Posts = ({posts}) => {

    return (
        <>
            {posts.map((post, index) => (
                <div key={index} className="flex items-center justify-center p-4">
                    <div className="rounded-xl border p-5 shadow-md w-9/12 bg-white">
                        <div className="flex w-full items-center justify-between border-b pb-3">
                            <div className="h-8 w-8">
                                ID: {post.id}
                            </div>
                            <div className="text-lg font-bold text-slate-700">
                                {post.userName}
                            </div>
                        </div>

                        <div className="mt-4 mb-6">
                            <div className="text-sm text-neutral-600">
                                {post.content}
                            </div>
                        </div>
                    </div>
                </div>
            ))
            }
        </>
    )


}

export default Posts;