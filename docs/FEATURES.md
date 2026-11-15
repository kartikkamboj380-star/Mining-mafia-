# Features — Mining Mafia

## Implemented Features

### Authentication
- Google Sign-In (via Firebase Auth + authorized backend exchange)
- Email/password registration
- Email verification (Firebase)
- Login with email/password
- Forgot password / password reset
- Secure session handling (tokens in EncryptedSharedPreferences)
- Logout

### Account Management
- Connect multiple accounts (Google or email)
- List connected accounts with individual balances
- Account connection status (connected/disconnected/session expired)
- Disconnect an account
- Combined balance dashboard (aggregated from provider)

### Mining
- Start / stop mining controls
- Real mining metrics from authorized backend (hashrate, accepted/rejected shares, worker status, uptime, verified rewards, pool connection status)
- Automatic reconnect on pool disconnection
- Network interruption handling
- Battery-aware operation (pauses on low battery)
- Temperature monitoring (pauses on overheating)
- Foreground service with visible notification (non-stealth)

### Wallet
- Combined verified balance across all accounts
- Per-account balances
- Pending and confirmed rewards
- Currency/token display
- Transaction history (rewards, withdrawals, deposits)
- Provider limitation clearly shown when no authorized balance API exists

### Withdrawal
- Destination address, network, currency, amount input
- Minimum withdrawal amount check
- Available balance check
- Confirmation dialog before submission
- Submitted via authorized backend only (success claimed only on provider confirmation)
- Saved withdrawal destinations (protected, editable, deletable)
- Withdrawal history

### Device Monitoring
- Battery level and charging status
- Device temperature
- Battery-aware and temperature-aware mining pauses

### UI / UX
- Premium dark theme (Material Components)
- Home, Mining, Accounts, Wallet, Transactions, Withdrawal, Settings navigation
- Loading, empty, and error states
- Responsive layouts for phones
- Splash screen

### Build / CI
- GitHub Actions workflow: JDK setup, Android SDK, tests, lint, debug APK build, APK artifact upload
- Lightweight Gradle config optimized for low-memory/CI builds
- No hardcoded secrets or signing keys

## Features Blocked / Requiring User Configuration

| Feature | Status | Reason |
|---------|--------|--------|
| CT Pool source inspection | ❌ Blocked | Google Drive ZIP inaccessible (connector failing; sandbox blocks drive.google.com) |
| Real mining backend integration | ⚠ Partial | Backend URL must be configured in Settings; endpoint signatures are placeholders pending CT Pool API inspection |
| Google Sign-In production | ⚠ Partial | Requires `google-services.json` and a real Google web client ID (not committed) |
| Withdrawal provider confirmation | ⚠ Partial | Requires authorized provider withdrawal API |
| Balance aggregation | ⚠ Partial | Requires authorized provider balance API |

## What Is NOT in This App (by design)
- No fake hashrate, fake shares, or fake rewards
- No hardcoded API secrets or signing keys
- No hidden/stealth services
- No bypass of provider limits, CAPTCHA, KYC, or anti-abuse
- No promise of 24/7 mining
- No transfer of funds between accounts without explicit authorization
