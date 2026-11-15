package com.learnium.RNDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    HANDSET("Handset"),
    TABLET("Tablet"),
    TV("Tv"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41871a;

    a(String str) {
        this.f41871a = str;
    }

    public String d() {
        return this.f41871a;
    }
}
