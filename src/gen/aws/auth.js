"use strict";

var _interopRequireDefault = require("@babel/runtime/helpers/interopRequireDefault");

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.auth = void 0;
exports.confirmSignUp = confirmSignUp;
exports.resendCode = resendCode;
exports.signIn = signIn;
exports.signUp = signUp;

var _regenerator = _interopRequireDefault(require("@babel/runtime/regenerator"));

var _extends2 = _interopRequireDefault(require("@babel/runtime/helpers/extends"));

var _asyncToGenerator2 = _interopRequireDefault(require("@babel/runtime/helpers/asyncToGenerator"));

var _awsAmplify = require("aws-amplify");

function signUp(_x) {
  return _signUp.apply(this, arguments);
}

function _signUp() {
  _signUp = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee(_ref) {
    var username, password, email, phoneNumber, _yield$Auth$signUp, user;

    return _regenerator["default"].wrap(function _callee$(_context) {
      while (1) {
        switch (_context.prev = _context.next) {
          case 0:
            username = _ref.username, password = _ref.password, email = _ref.email, phoneNumber = _ref.phoneNumber;
            _context.prev = 1;
            _context.next = 4;
            return _awsAmplify.Auth.signUp({
              username: username,
              password: password,
              attributes: {
                email: email,
                // optional
                phone_number: phoneNumber // optional - E.164 number convention
                // other custom attributes

              }
            });

          case 4:
            _yield$Auth$signUp = _context.sent;
            user = _yield$Auth$signUp.user;
            console.log("User signed up successfully", user);
            return _context.abrupt("return", user);

          case 10:
            _context.prev = 10;
            _context.t0 = _context["catch"](1);
            console.log('error signing up:', _context.t0);

          case 13:
          case "end":
            return _context.stop();
        }
      }
    }, _callee, null, [[1, 10]]);
  }));
  return _signUp.apply(this, arguments);
}

function confirmSignUp(_x2) {
  return _confirmSignUp.apply(this, arguments);
}

function _confirmSignUp() {
  _confirmSignUp = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee2(_ref2) {
    var username, code, resp;
    return _regenerator["default"].wrap(function _callee2$(_context2) {
      while (1) {
        switch (_context2.prev = _context2.next) {
          case 0:
            username = _ref2.username, code = _ref2.code;
            _context2.prev = 1;
            _context2.next = 4;
            return _awsAmplify.Auth.confirmSignUp(username, code);

          case 4:
            resp = _context2.sent;
            return _context2.abrupt("return", resp);

          case 8:
            _context2.prev = 8;
            _context2.t0 = _context2["catch"](1);
            console.log('error confirming sign up', _context2.t0);

          case 11:
          case "end":
            return _context2.stop();
        }
      }
    }, _callee2, null, [[1, 8]]);
  }));
  return _confirmSignUp.apply(this, arguments);
}

function signIn(_x3) {
  return _signIn.apply(this, arguments);
}

function _signIn() {
  _signIn = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee3(_ref3) {
    var username, password, user, userAttributes, _user$getSignInUserSe, refreshToken, accessToken;

    return _regenerator["default"].wrap(function _callee3$(_context3) {
      while (1) {
        switch (_context3.prev = _context3.next) {
          case 0:
            username = _ref3.username, password = _ref3.password;
            _context3.prev = 1;
            _context3.next = 4;
            return _awsAmplify.Auth.signIn(username, password);

          case 4:
            user = _context3.sent;
            userAttributes = user.attributes;
            _user$getSignInUserSe = user.getSignInUserSession(), refreshToken = _user$getSignInUserSe.refreshToken, accessToken = _user$getSignInUserSe.accessToken;
            return _context3.abrupt("return", (0, _extends2["default"])({
              refreshToken: refreshToken.getToken(),
              jwtToken: accessToken.jwtToken
            }, userAttributes));

          case 10:
            _context3.prev = 10;
            _context3.t0 = _context3["catch"](1);
            console.log('error signing in', _context3.t0);

          case 13:
          case "end":
            return _context3.stop();
        }
      }
    }, _callee3, null, [[1, 10]]);
  }));
  return _signIn.apply(this, arguments);
}

function resendCode(_x4) {
  return _resendCode.apply(this, arguments);
}

function _resendCode() {
  _resendCode = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee4(username) {
    var resp;
    return _regenerator["default"].wrap(function _callee4$(_context4) {
      while (1) {
        switch (_context4.prev = _context4.next) {
          case 0:
            _context4.prev = 0;
            _context4.next = 3;
            return _awsAmplify.Auth.resendSignUp(username);

          case 3:
            resp = _context4.sent;
            console.log('code resent successfully');
            return _context4.abrupt("return", resp);

          case 8:
            _context4.prev = 8;
            _context4.t0 = _context4["catch"](0);
            console.log('error resending code: ', _context4.t0);

          case 11:
          case "end":
            return _context4.stop();
        }
      }
    }, _callee4, null, [[0, 8]]);
  }));
  return _resendCode.apply(this, arguments);
}

function signOut() {
  return _signOut.apply(this, arguments);
}

function _signOut() {
  _signOut = (0, _asyncToGenerator2["default"])( /*#__PURE__*/_regenerator["default"].mark(function _callee5() {
    var resp;
    return _regenerator["default"].wrap(function _callee5$(_context5) {
      while (1) {
        switch (_context5.prev = _context5.next) {
          case 0:
            _context5.prev = 0;
            _context5.next = 3;
            return _awsAmplify.Auth.signOut({
              global: true
            });

          case 3:
            resp = _context5.sent;
            return _context5.abrupt("return", resp);

          case 7:
            _context5.prev = 7;
            _context5.t0 = _context5["catch"](0);
            console.log('error signing out: ', _context5.t0);

          case 10:
          case "end":
            return _context5.stop();
        }
      }
    }, _callee5, null, [[0, 7]]);
  }));
  return _signOut.apply(this, arguments);
}

var auth = {
  Auth: _awsAmplify.Auth
};
exports.auth = auth;