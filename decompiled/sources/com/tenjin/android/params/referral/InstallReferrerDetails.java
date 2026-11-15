package com.tenjin.android.params.referral;

/* JADX INFO: loaded from: classes3.dex */
public class InstallReferrerDetails {
    long clickTimestamp;
    long installTimestamp;
    String url;

    public InstallReferrerDetails(String str, long j10, long j11) {
        this.url = str;
        this.installTimestamp = j10;
        this.clickTimestamp = j11;
    }
}
