(ns app.view
  (:require [reagent.core :as r]
            ["/components/Button" :refer [Button]]
            ["/components/Alert" :refer [Alert]]
            ["/hooks/react" :refer [useCallback useState]]))

(defn custom-hooks-counter []
  (let [[count set-count] (useState 0)
        set-counter (useCallback
                     (fn [] (set-count (inc count)))
                     (clj->js [count]))]
    [:div
     [:div (str "Counter: " count)]
     [:button
      {:on-click set-counter}
      "Inc"]]))

(defn nav-bar []
  [:nav.mb-8.flex.justify-between.items-stretch
   [:h1.font-600 "novus"]
   [:div.flex.items-stretch
     [:div.flex.items-center.h-full.-space-x-6
      [:div.flex.items-center
       [:p "courses"]]]]])

(defn splash-page []
  [:div.my-16
   [:h1.uppercase.text-5xl "Where developers"
    [:span.block " become "]
    [:strong.block.font-strong "problem solvers"]]
   [:div.my-8
    [:h3.text-2xl.font-light "novus challenges and pushes curious learners through "
     [:strong.font-medium "real life "
      [:span.block " startup simulations and complex startup games"]]]
    [:> Button {:title "Get Started"
                :className "px-8"}]]])


(defn why-novus []
  [:div.my-16.grid.place-items-center
   [:h1.uppercase.text-2xl "Why novus?"]])



(defn fundamentals []
  [:div.my-16
   [:div.grid.place-items-center
    [:h1.uppercase.font-800.text-2xl "Core Foundations"]
    [:h3.my-4.italic "this series is about mastering the fundamentals of web development by hacking your own duolingo account, interactively"]
    [:p "skills you will pick up: " [:strong "html, javascript, css, how to learn, value oriented programming, object oriented programming, how to think in data, flow driven development, learn how to learn, hacking, google chrome browser, events"]]]])

(defn startup-simulations []
  [:div.my-16
   [:div.grid.place-items-center
    [:h1.uppercase.font-800.text-2xl "Startup Engineer Intern Series"]
    [:h3.my-4.italic.font-bold "this series simulates what a typical university student their software engineering intership journey "]
    [:p.my-4 "Duration: " [:strong "16 - 20 months"]]
    [:p "skills you will pick up: " [:strong "how to read code, how to make simple 2d games, vectors, matrices, browsers events system, html, javascript, css, typescript, github, remote working and much much more"]]]
   [:div.grid.gap-8.grid-cols-2.my-8
    [:div
     [:h4.text-xl "Internship 1 - repl.it kaboomJS core - " [:strong "🎓 the intern"]]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Internship 2 - codesandbox - " [:strong "frontend developer"]]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "💪💪"]]
     [:p "prequesites" [:strong "😀 💪"]]
     [:p "tech stack" [:strong " react & typescript"]]
     [:p "time: " [:strong "4 months"]]]
    [:div
     [:h4.text-xl "Internship 3 - Athens Research -" [:strong "software engineer"]]
     [:p "difficulty: " [:strong "💪"]]
     [:p "prequesites: " [:strong " 💪💪"]]
     [:p "tech stack: " [:strong " clojure, clojurescript & typescript"]]
     [:p "time: " [:strong "4 months"]]]
    [:div
     [:h4.text-xl "Internship 4 - Metabase - " [:strong "software engineer"]]
     [:p "difficulty: " [:strong "💪💪💪"]]
     [:p "prequesites: " [:strong " 💪💪"]]
     [:p "tech stack: " [:strong " react, clojure, clojurescript, postgresql"]]
     [:p "time: " [:strong "4 months"]]]
    [:div
     [:h4.text-xl "Internship 5 (op) - remix.run - " [:strong "software engineer"]]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "💪💪💪"]]
     [:p "prequesites: " [:strong " 💪💪"]]
     [:p "tech stack: " [:strong " typescript, node, react"]]
     [:p "time: " [:strong "4 months"]]]]])

(defn capstone-project []
  [:div.my-16
   [:div.grid.place-items-center
    [:h1.uppercase.font-800.text-2xl "Capstone Project"]
    [:h3.my-4.italic.font-bold "this series simulates what a typical university student their software engineering intership journey "]]])


(defn main-view []
 [:div.m-12
  [nav-bar]
  [splash-page]
  [why-novus]
  [fundamentals]
  [startup-simulations]
  [capstone-project]])
