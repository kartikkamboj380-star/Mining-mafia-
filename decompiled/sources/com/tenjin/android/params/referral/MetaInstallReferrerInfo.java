package com.tenjin.android.params.referral;

/* JADX INFO: loaded from: classes3.dex */
public class MetaInstallReferrerInfo {
    private final long actualTimestamp;
    private final String installReferrer;
    private final boolean isClickThrough;

    public MetaInstallReferrerInfo(String str, long j10, boolean z9) {
        this.installReferrer = str;
        this.actualTimestamp = j10;
        this.isClickThrough = z9;
    }

    public long getActualTimestamp() {
        return this.actualTimestamp;
    }

    public String getInstallReferrer() {
        return this.installReferrer;
    }

    public boolean isClickThrough() {
        return this.isClickThrough;
    }
}
