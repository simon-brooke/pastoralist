# pastoralist

generated using Luminus version "3.54"

A web-app intended to be used by pastoralists in managing
pastures, grazing, and animals.

## WARNING

Preliminary code; nothing at all works yet.

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Building

To generate the majority of the code, run

    lein adl

**NOTE THAT** currently this relies on development versions of the ADL framework; in order to work for you locally, this requires that you check out the development branches of each of

1. [adl-support](https://github.com/simon-brooke/adl-support/)
2. [adl](https://github.com/simon-brooke/adl); and
3. [lein-adl](https://github.com/simon-brooke/lein-adl)

And, in each repository in the order listed above, run

    lein test
    lein install

All tests should pass. This will install the development versions locally.

## Running

To start a web server for the application, run:

    lein run

## License

Copyright © 2019 Simon Brooke (simon@journeyman.cc)
