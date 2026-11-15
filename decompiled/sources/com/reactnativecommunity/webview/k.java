package com.reactnativecommunity.webview;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Regex f42179a = new Regex("[\\\\/%\"]");

    public static final Regex a() {
        return f42179a;
    }
}
