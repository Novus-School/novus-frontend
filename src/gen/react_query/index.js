"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.queryClient = exports.QueryClientProvider = void 0;

var _reactQuery = require("react-query");

var _devtools = require("react-query/devtools");

var _jsxRuntime = require("react/jsx-runtime");

var queryClient = new _reactQuery.QueryClient();
exports.queryClient = queryClient;

var QueryClientProvider = function QueryClientProvider(props) {
  return /*#__PURE__*/(0, _jsxRuntime.jsxs)(_reactQuery.QueryClientProvider, {
    client: queryClient,
    children: [props.children, /*#__PURE__*/(0, _jsxRuntime.jsx)(_devtools.ReactQueryDevtools, {
      initialIsOpen: false
    })]
  });
};

exports.QueryClientProvider = QueryClientProvider;