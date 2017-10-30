A [Giter8][g8] template to save time when I want to just throw together some
random scala code. Based entirely on whatever happens to be my preferred style
of Scala coding today.

libs:

* cats
* scalatest
* http4s
* scala-logging + logback
* doobie

plugins:

* scalariform
* kind projector

notes:

Currently defaults to 'fork=true' because I the random classloader leaks in different libraries causing me
to run out of metaspace while coding got more annoying than the increase in build time.

Template license
----------------
Written in 2017 by Charles Miller <cmiller@pastiche.org>

To the extent possible under law, the author(s) have dedicated all copyright and related
and neighboring rights to this template to the public domain worldwide.
This template is distributed without any warranty. See <http://creativecommons.org/publicdomain/zero/1.0/>.

[g8]: http://www.foundweekends.org/giter8/
