import React from 'react'

const ButtonComponent = (props) => {
    return (
        <button className="py-2 px-4 bg-gray-700 text-cyan-50 my-4 uppercase" onClick={props.onClick}>
            {props.title}
        </button>
    )
}

export { ButtonComponent as Button };
