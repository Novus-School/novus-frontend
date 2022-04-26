"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.Button = void 0;

var _react = _interopRequireDefault(require("react"));

var _jsxRuntime = require("react/jsx-runtime");

var ButtonComponent = function ButtonComponent(props) {
  return /*#__PURE__*/(0, _jsxRuntime.jsx)("button", {
    className: "py-2 px-4 bg-gray-700 text-cyan-50 my-4",
    onClick: props.onClick,
    children: props.title
  });
};

exports.Button = ButtonComponent;