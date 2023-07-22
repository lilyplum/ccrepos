import { useState, useEffect } from "react";

const useFetch = (url) => {
  const [data, setData] = useState({});
  const [currentUrl, setCurrentUrl] = useState(url);

  useEffect(() => {
      fetch(currentUrl).then((response) => {
        if (response.status === 200) return response.json();
      })
      .then(data => {
        setData(data)
      });
  }, [currentUrl]);

  return [data, setCurrentUrl];
};

export default useFetch;
