"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.studentService = void 0;

var _regenerator = _interopRequireDefault(require("@babel/runtime/regenerator"));

var _asyncToGenerator2 = _interopRequireDefault(require("@babel/runtime/helpers/asyncToGenerator"));

var ROOT_URL = "http://localhost:8080/v1";
var studentService = {
  browse: function () {
    var _browse = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee() {
      var students;
      return _regenerator["default"].wrap(function _callee$(_context) {
        while (1) {
          switch (_context.prev = _context.next) {
            case 0:
              _context.next = 2;
              return fetch("".concat(ROOT_URL, "/students"));

            case 2:
              students = _context.sent;
              return _context.abrupt("return", students.json());

            case 4:
            case "end":
              return _context.stop();
          }
        }
      }, _callee);
    }));

    function browse() {
      return _browse.apply(this, arguments);
    }

    return browse;
  }()
};
exports.studentService = studentService;