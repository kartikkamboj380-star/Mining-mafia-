# Mining Mafia

Mining Mafia is a Kotlin / Jetpack Compose Android app for SHA-256d share mining against a
Stratum v1 pool you choose. It supports multiple accounts, parallel mining sessions with
automatic reconnection, live hashrate and share statistics, battery and temperature
safety, a combined wallet with transaction history, and withdrawal requests.

> **Honesty note.** A phone's hashrate is tiny compared with dedicated mining hardware, and
> balances are only what your pool reports. The app does not fabricate rewards or payouts.

## Quick links

| What | Where |
| --- | --- |
| Android app (Kotlin, Compose, Room, WorkManager, foreground service) | [`app/`](app/) |
| Core mining engine (Stratum client, hashing, sessions) | [`app/src/main/java/com/miningmafia/app/mining/`](app/src/main/java/com/miningmafia/app/mining/) |
| Data layer (Room, PBKDF2 passwords, pool API client) | [`app/src/main/java/com/miningmafia/app/data/`](app/src/main/java/com/miningmafia/app/data/) |
| Compose screens | [`app/src/main/java/com/miningmafia/app/ui/screens/`](app/src/main/java/com/miningmafia/app/ui/screens/) |
| Unit tests | [`app/src/test/`](app/src/test/) |
| GitHub Actions APK workflow | [`.github/workflows/android-build.yml`](.github/workflows/android-build.yml) |
| Extracted CT Pool decompiled source (reference) | [`decompiled/`](decompiled/) — [`sources/`](decompiled/sources/) · [`resources/`](decompiled/resources/) |
| Original CT Pool archive parts | [`CTPool_Decompiled.zip.part-000`](CTPool_Decompiled.zip.part-000) and [`part-001`](CTPool_Decompiled.zip.part-001) |

### About `decompiled/`

`decompiled/` is the complete extraction of `CTPool_Decompiled.zip` (the two split parts were
concatenated in order, verified with `unzip -t`, and extracted). It contains 17,162 files:
Java sources under `sources/` and Android resources and manifest under `resources/`. The three
compiled APKs in the archive (`extracted/net.ctpool.apk` and two config splits) are binary
artifacts and are left only in the ZIP parts to keep the repository small. This tree is kept
as reference material and is not compiled by the Gradle build.

## Features

- **Accounts:** email and password registration (PBKDF2-HMAC-SHA256, 120k iterations), Google Sign-In via Credential Manager, and multiple accounts per device with an active account.
- **Mining:** one Stratum session per selected account (up to 4), each with parallel hashing threads, automatic reconnection with exponential backoff (2 s to 60 s), and a foreground service with a visible notification and a Stop action.
- **Safety:** hashing pauses when the battery temperature reaches 45 °C, the thermal status is severe or higher, or the battery is at or below 10% and not charging.
- **Statistics:** live hashrate, accepted and rejected shares, difficulty, uptime, reconnect count, and last error.
- **Wallet:** combined and per-account balances (from pool sync), transaction history, withdrawal requests, and a preferred payout address.
- **Recovery:** a WorkManager watchdog restarts mining after process death or reboot if mining was on. Balance sync runs every 30 minutes when online.
- **Resource use:** defaults to 2 threads per session, limited to the device's core count. Target device is 3 GB RAM.

## Build and install

### Option A: download the APK from GitHub Actions

1. Open the **Actions** tab of this repository and select the latest **Android build** run.
2. Download the **mining-mafia-debug-apk** artifact and unzip it.
3. On the phone, allow installs from your browser or file manager, then install `app-debug.apk`.

### Option B: build locally

Requirements: JDK 17, Android SDK with platform 34 and build-tools 34.0.0, Gradle 8.7.

```bash
gradle :app:testDebugUnitTest :app:assembleDebug
# APK: app/build/outputs/apk/debug/app-debug.apk
```

Optional build properties go in `~/.gradle/gradle.properties` or `gradle.properties`:

```properties
GOOGLE_WEB_CLIENT_ID=<your OAuth Web client ID>.apps.googleusercontent.com
POOL_API_BASE=https://your-pool.example.com/api
```

## Configuration in the app

1. **Settings → Mining pool:** enter your Stratum host, port, and TLS setting.
2. **Settings → Pool account API:** enter the HTTPS base URL for balance and withdrawal endpoints, plus an API key if your pool requires one.
3. **Accounts:** register or sign in. Add more accounts as needed.
4. **Mining:** tick the accounts to mine with, then tap **Start mining**.

### Pool API contract

```
GET  {base}/balance?worker=NAME   -> {"confirmed":"0.123","pending":"0.001"}
POST {base}/withdraw              body {"worker","address","amount"} -> {"id":"..."}
```

Requests are rejected unless they use HTTPS. Withdrawals are requests that the pool processes.

## Known limits

- Google ID tokens are not verified server-side here. Add verification on your backend before relying on Google identities.
- `dataSync` foreground services have a time limit on Android 15+ (`targetSdk` is 34 here). Add an `onTimeout` handler before raising `targetSdk`.
- Background starts of foreground services can be refused by Android. The watchdog retries on its next cycle.
- Release builds are unsigned. Sign them before distribution.

## Repository layout

```
app/                  Android application module
decompiled/           Extracted CT Pool decompiled source (reference)
.github/workflows/    CI: unit tests + debug APK artifact
CTPool_Decompiled.zip.part-*  Original split archive
```
