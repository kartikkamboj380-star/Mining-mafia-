# Technical Details — Mining Mafia

## Architecture
- **Language:** Java (with AndroidX), Kotlin-compatible Gradle setup
- **Architecture:** Simple repository pattern with ViewModel + LiveData UI layer
- **DI:** Lightweight `AppContainer` (no heavy DI framework, keeps APK small)
- **Local DB:** Room (accounts, transactions, withdrawals, saved destinations)
- **Secure storage:** EncryptedSharedPreferences (auth tokens, backend config)
- **Networking:** OkHttp + Retrofit
- **Auth:** Firebase Auth + custom backend token exchange
- **Background:** Foreground service (dataSync type, user-visible notification) + WorkManager-ready
- **Build:** Gradle 8.x, Android Gradle Plugin 8.2.0, compileSdk 34, minSdk 21

## Package Structure
```
com.miningmafia.app
  app            – Application class, DI container
  auth           – Authentication repository (Firebase + backend)
  data
    db           – Room entities, DAOs, database
    remote       – Retrofit API interface, data models
    repo         – Account, Wallet, Withdrawal repositories
  di             – AppContainer
  mining         – MiningManager, MiningMonitorService (foreground)
  ui             – Activities, fragments, viewmodels
    auth, home, mining, accounts, wallet, transactions, withdrawal, settings, splash
  util           – EncryptedPrefs, BatteryTempMonitor, NetworkMonitor
```

## Security Design
- Passwords are never stored locally (handled by Firebase Auth).
- Auth ID/refresh tokens stored in AES-256 EncryptedSharedPreferences.
- Backend base URL stored encrypted; configurable at runtime.
- `android:usesCleartextTraffic="false"` — HTTPS only.
- `android:allowBackup="false"`.
- No API secrets, signing keys, or provider credentials in the repository.
- Financial operations validated server-side; client-side validation is a UX convenience only.

## Mining Design (Honest)
- All mining metrics come from the authorized provider backend.
- Nothing is fabricated: no fake hashrate, shares, or rewards.
- If CT Pool uses virtual/gamified rewards, that is labeled as virtual rewards — not described as Bitcoin mining unless verified.
- Mining pauses on device overheat (≥45°C) and critically low battery (≤15% not charging).
- Foreground service shows a persistent notification; user can stop it.
- `START_NOT_STICKY` — service is not force-restarted by the system, respecting Android background limits.

## Dependencies (kept minimal)
- androidx.appcompat, material, constraintlayout
- androidx.activity, fragment, navigation
- androidx.lifecycle (viewmodel, livedata, runtime)
- androidx.room (runtime, ktx, compiler via annotationProcessor)
- androidx.work (runtime-ktx)
- androidx.security (crypto)
- com.google.firebase:firebase-auth-ktx
- com.google.android.gms:play-services-auth
- com.squareup.okhttp3:okhttp
- com.squareup.retrofit2:retrofit + converter-gson

## GitHub Actions
- `.github/workflows/android-build.yml`
- Triggers: push/PR to `arena/d51431c3-mining-mafia` or `main`, plus manual dispatch
- Steps: checkout → JDK 17 → Android SDK → cache Gradle → unit tests → lint → assembleDebug → upload APK artifact
