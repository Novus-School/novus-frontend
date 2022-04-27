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
   [:div.flex.grid-gap-2
    [:p.mx-4 "courses"]
    [:p.mx-4 "login"]
    [:p.mx-4 "register"]]])

(defn splash-page []
  [:div.my-16
   [:h1.uppercase.text-5xl "Where developers"
    [:span.block " become "]
    [:strong.block.font-strong "problem solvers"]]
   [:div.my-8
    [:h3.text-2xl.font-light "novus challenges and pushes curious learners through "
     [:strong.font-medium "real life "
      [:span.block " startup simulations and complex games"]]]
    [:> Button {:title "Get Started"
                :className "px-8"}]]])


(defn why-novus []
  [:div.my-16
   [:div.grid.place-items-center
    [:h1.uppercase.text-2xl "Our Learning Goals"]]
   [:p.italic.my-8 "The key to mastery and long term skills is focusing on principals. We designed our curriculum with the following learning goals."]
   [:div.grid.grid-cols-2.gap-4.place-items-center
    [:p "focus on " [:span.font-bold "principles"] ", not " [:span.italic "\"best practices\""]]
    [:p "build a strong learning foundation"]
    [:p "practice " [:span.font-bold "error driven development"]]
    [:p "learn like a " [:span.font-bold "mechanic"]]
    [:p "learn to solve problems  " [:span.font-bold "collaboratively"]]
    [:p "soratic method - learn to ask the " [:span.font-bold "right questions"]]
    [:p "be curious, be " [:span.font-bold "self critical"]]
    [:p "become code literate - master the art of reading any codebase"]
    [:p "learn to " [:span.font-bold "think in data"]]
    [:p "learn to " [:span.font-bold "thinking in/about systems"]]]])

(defn fundamentals []
  [:div.my-16
   [:div.grid.place-items-center
    [:h1.uppercase.font-800.text-2xl "Core Foundations 🎓"]
    [:h3.my-4.italic "this series is about mastering the fundamentals of web development by hacking your own duolingo account, interactively"]
    [:p "skills you will pick up: " [:strong "html, javascript, css, how to learn, value oriented programming, object oriented programming, how to think in data, flow driven development, learn how to learn, hacking, google chrome browser, events, how to think like a programmer, question everything"]]]
   [:div.grid.gap-8.grid-cols-2.my-8
    [:div
     [:h4.text-xl "Module 1 - Computing: Past, Present and Future 🎓"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 2 - What is Software Engineering?"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 3 - HTML and CSS"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 4 - JavaScript"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 5 - Thinking in Data: Introduction"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 6 - Networking 101"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]
    [:div
     [:h4.text-xl "Module 7 - Database 101"]
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
     [:p "difficulty: " [:strong "😀 💪"]]
     [:p "prequesites: " [:strong " none"]]
     [:p "time: " [:strong "2~4 months"]]]]])

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
     [:p "spicyness: " [:strong "🌶️🌶️🌶️🌶️"]]
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
    [:h1.uppercase.font-800.text-2xl "Capstone Project - Building own startup"]
    [:h3.my-4.italic.font-bold "this series simulates what a typical university student their software engineering intership journey "]
    [:p.my-4 "Duration: " [:strong "6 months"]]]])


(defn main-view []
 [:div.m-12
  [nav-bar]
  [splash-page]
  [why-novus]
  [fundamentals]
  [startup-simulations]
  [capstone-project]])
