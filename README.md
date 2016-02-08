# lookbackdemo
Demostrates sample Android project setup for Lookback.io https://lookback.io/ for production and debug builds. Beta builds provides Lookback functionality by shaking the device. On other hand production build does not compile Lookback library.

## Project structure
Whole setup benefits from Android product flavors. `beta` flavor compiles Lookback.io library with all it's dependencies. `AndroidManifest` and Java classes which provide Lookback functionality are added. In `prod` flavor there are only no-op classes.
