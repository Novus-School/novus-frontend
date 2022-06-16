"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.useFetchStudents = void 0;

var _reactQuery = require("react-query");

var _common = require("../common.types");

var _StudentService = require("../../services/StudentService");

var useFetchStudents = function useFetchStudents() {
  return (0, _reactQuery.useQuery)(_common.QueryId.students, _StudentService.StudentService.browse);
};

exports.useFetchStudents = useFetchStudents;