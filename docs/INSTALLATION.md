# Installation Instructions — Mining Mafia

## Prerequisites
- Android phone running Android 5.0 (API 21) or higher
- Approximately 100 MB free storage
- Internet connection (for authentication and provider API)

## Install the Debug APK

### Option 1: Download from GitHub Actions (recommended)
1. Go to the **Actions** tab of this repository.
2. Select the latest successful "Android Build" run.
3. Download the `mining-mafia-debug-apk` artifact.
4. Transfer the `app-debug.apk` to your Android phone.
5. On your phone, enable **Install from unknown sources** (Settings → Security → Install unknown apps).
6. Open the APK and install.

### Option 2: Build locally (requires Android SDK)
```bash
git clone https://github.com/kartikkamboj380-star/Mining-mafia-.git
cd Mining-mafia-
./gradlew assembleDebug
```
The APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

## First Run Configuration
1. Open the app — you'll see the splash screen, then the auth screen.
2. Register with email/password or sign in with Google.
3. **Important:** Go to Settings → Backend Base URL and enter your authorized mining/wallet backend URL.
   - The app does NOT contain any backend credentials or API keys.
   - Mining, balances, and withdrawals will not work until this is pointed at your authorized provider backend.
4. Connect your accounts (Google or email).
5. Use the Home dashboard to view combined balance, mining status, temperature, and battery.

## Security Notes
- No passwords are stored in plain text.
- Auth tokens are stored in EncryptedSharedPreferences.
- Backend URL is stored encrypted locally.
- No signing keys or API secrets are in this repository.
