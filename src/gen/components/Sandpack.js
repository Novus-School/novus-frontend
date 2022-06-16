"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.SandpackApp = SandpackApp;

var _sandpackClient = require("@codesandbox/sandpack-client");

// import { Sandpack } from "@codesandbox/sandpack-react";
// import "@codesandbox/sandpack-react/dist/index.css";
var client = new _sandpackClient.SandpackClient("#preview", {
  files: {
    "/index.js": {
      code: "console.log(require('uuid'))"
    }
  }
});

function SandpackApp() {// return (
  // <Sandpack
  //   // You can change these examples!
  //   // Try uncommenting any of these lines
  //   // theme="dark"
  //   // template="react"
  // />
  // );
}