# Biff example project

This is the example/template project for Biff.

Run `bb dev` to get started. See `bb tasks` for other commands.

# Making this a Postgres

- [X] Postgres in docker for local development
- [X] Connecting to postgres
- [ ] Setup a Flyway or other migration thingy (https://www.prasanna.dev/posts/flyway-migrations-in-lein-clojure)
- [ ] Use fns with postgres instead of xtdb
  - [ ] ./src/com/kishima.clj:59:   :biff.xtdb/tx-fns biff/tx-fns
  - [ ] ./src/com/kishima/worker.clj:4:            [xtdb.api :as xt]))
  - [ ] ./src/com/kishima/worker.clj:19:(defn alert-new-user [{:keys [biff.xtdb/node]} tx]
  - [ ] ./src/com/kishima/repl.clj:27:  ;; database by running `rm -r storage/xtdb` (DON'T run that in prod),
  - [ ] ./src/com/kishima/app.clj:7:            [xtdb.api :as xt]
  - [ ] ./src/com/kishima/home.clj:8:            [xtdb.api :as xt]))

