# CT Pool Decompiled Source — Access Blocked

## Status: ❌ NOT ACCESSIBLE

The original CT Pool decompiled ZIP (`CTPool_Decompiled.zip`, 33 MB) is stored in the project owner's Google Drive at file ID `1o02sZNXHBjX3OX2qVT29aLzvA6SPlSKa`.

### What was attempted
1. **Google Drive connector** — All calls (`list_files`, `search_files`, `download_file`, `validate_credential`) return "Something went wrong." The Drive connection is not functioning despite the app being shown as connected.
2. **Direct download** — The sandbox restricts outbound internet to `github.com`, `registry.npmjs.org`, and `pypi.org` only. Direct access to `drive.google.com` / `drive.usercontent.google.com` is blocked.

### What this means
- Phase 1 (source audit of CT Pool) cannot be completed.
- The CT Pool backend API endpoints, mining mechanism, and real-vs-displayed balance logic could not be inspected.
- The Mining Mafia Android app is built to connect to a **configurable backend URL** (set in Settings). The user must point it at their authorized CT Pool backend and the app's `BackendApi` interface signatures must be adjusted to match the real, documented provider API.

### Required from user
- Upload `CTPool_Decompiled.zip` to this conversation, OR
- Reconnect/fix the Google Drive connection in Arena so the connector works.

Once the ZIP is available, it will be extracted into `analysis/CTPool_Decompiled/` and a full technical audit will be produced.
