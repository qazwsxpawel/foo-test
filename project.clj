(defproject foo-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :release-tasks [#_["change" "version"
                   "leiningen.release/bump-version" "release"]
                  #_["vcs" "tag" "--no-sign" ":prefix" "release-notes-"]
                  #_["with-profile" "ci-build" "pkg"]
                  #_["with-profile" "lci-build" "release-notes-plugin" "create" "onthemarket/release-notes" "release-notes"]
                  #_["change" "version" "leiningen.release/bump-version"]
                  #_["vcs" "commit"]
                  ["vcs" "push" "--tags"]]

  :dependencies [[org.clojure/clojure "1.10.0"]]
  :repl-options {:init-ns foo-test.core})
