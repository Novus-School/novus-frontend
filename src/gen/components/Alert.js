"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.Alert = void 0;

var _react = require("react");

var _react2 = require("@headlessui/react");

var _classnames = _interopRequireDefault(require("classnames"));

var _jsxRuntime = require("react/jsx-runtime");

var Alert = function Alert(_ref) {
  var isOpen = _ref.isOpen,
      message = _ref.message,
      _ref$variant = _ref.variant,
      variant = _ref$variant === void 0 ? 'warning' : _ref$variant;
  var classes = (0, _classnames["default"])('fixed top-2.5 left-1/2 transform -translate-x-1/2 max-w-sm w-full shadow-lg rounded-lg pointer-events-auto ring-1 ring-black ring-opacity-5 overflow-hidden', {
    'bg-rose-200': variant === 'warning',
    'bg-green-200': variant === 'success'
  });
  return /*#__PURE__*/(0, _jsxRuntime.jsx)(_react2.Transition, {
    show: isOpen,
    as: _react.Fragment,
    enter: "ease-out duration-300 transition",
    enterFrom: "opacity-0",
    enterTo: "opacity-100",
    leave: "transition ease-in duration-100",
    leaveFrom: "opacity-100",
    leaveTo: "opacity-0",
    children: /*#__PURE__*/(0, _jsxRuntime.jsx)("div", {
      className: classes,
      children: /*#__PURE__*/(0, _jsxRuntime.jsx)("div", {
        className: "p-4",
        children: /*#__PURE__*/(0, _jsxRuntime.jsx)("p", {
          className: "text-sm text-center font-medium text-gray-900",
          children: message
        })
      })
    })
  });
};

exports.Alert = Alert;