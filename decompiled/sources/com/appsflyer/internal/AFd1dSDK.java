package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public class AFd1dSDK {
    public final long AFAdRevenueData;

    public AFd1dSDK(long j10) {
        this.AFAdRevenueData = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.AFAdRevenueData == ((AFd1dSDK) obj).AFAdRevenueData;
    }

    public int hashCode() {
        long j10 = this.AFAdRevenueData;
        return (int) (j10 ^ (j10 >>> 32));
    }
}
