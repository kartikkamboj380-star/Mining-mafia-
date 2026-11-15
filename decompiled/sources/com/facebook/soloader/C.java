package com.facebook.soloader;

/* JADX INFO: loaded from: classes2.dex */
public class C extends UnsatisfiedLinkError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f16509a;

    public C(String str, String str2) {
        super(str2);
        this.f16509a = str;
    }

    public String a() {
        return this.f16509a;
    }
}
