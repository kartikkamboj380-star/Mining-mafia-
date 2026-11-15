package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3955jD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f30353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f30354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Layout.Alignment f30355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Layout.Alignment f30356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f30357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30358f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f30359g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f30360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f30362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f30363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f30364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f30365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f30366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f30367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f30368p;

    public C3955jD() {
        this.f30353a = null;
        this.f30354b = null;
        this.f30355c = null;
        this.f30356d = null;
        this.f30357e = -3.4028235E38f;
        this.f30358f = LinearLayoutManager.INVALID_OFFSET;
        this.f30359g = LinearLayoutManager.INVALID_OFFSET;
        this.f30360h = -3.4028235E38f;
        this.f30361i = LinearLayoutManager.INVALID_OFFSET;
        this.f30362j = LinearLayoutManager.INVALID_OFFSET;
        this.f30363k = -3.4028235E38f;
        this.f30364l = -3.4028235E38f;
        this.f30365m = -3.4028235E38f;
        this.f30366n = LinearLayoutManager.INVALID_OFFSET;
    }

    public final C3955jD a(CharSequence charSequence) {
        this.f30353a = charSequence;
        this.f30354b = null;
        return this;
    }

    public final CharSequence b() {
        return this.f30353a;
    }

    public final C3955jD c(Bitmap bitmap) {
        this.f30354b = bitmap;
        this.f30353a = null;
        return this;
    }

    public final C3955jD d(Layout.Alignment alignment) {
        this.f30355c = alignment;
        return this;
    }

    public final C3955jD e(Layout.Alignment alignment) {
        this.f30356d = alignment;
        return this;
    }

    public final C3955jD f(float f10, int i10) {
        this.f30357e = f10;
        this.f30358f = i10;
        return this;
    }

    public final C3955jD g(int i10) {
        this.f30359g = i10;
        return this;
    }

    public final int h() {
        return this.f30359g;
    }

    public final C3955jD i(float f10) {
        this.f30360h = f10;
        return this;
    }

    public final C3955jD j(int i10) {
        this.f30361i = i10;
        return this;
    }

    public final int k() {
        return this.f30361i;
    }

    public final C3955jD l(float f10, int i10) {
        this.f30363k = f10;
        this.f30362j = i10;
        return this;
    }

    public final C3955jD m(float f10) {
        this.f30364l = f10;
        return this;
    }

    public final C3955jD n(float f10) {
        this.f30365m = f10;
        return this;
    }

    public final C3955jD o(int i10) {
        this.f30366n = i10;
        return this;
    }

    public final C3955jD p(float f10) {
        this.f30367o = f10;
        return this;
    }

    public final C3955jD q(int i10) {
        this.f30368p = i10;
        return this;
    }

    public final KD r() {
        return new KD(this.f30353a, this.f30355c, this.f30356d, this.f30354b, this.f30357e, this.f30358f, this.f30359g, this.f30360h, this.f30361i, this.f30362j, this.f30363k, this.f30364l, this.f30365m, false, -16777216, this.f30366n, this.f30367o, this.f30368p, null);
    }

    /* synthetic */ C3955jD(KD kd, byte[] bArr) {
        this.f30353a = kd.f20140a;
        this.f30354b = kd.f20143d;
        this.f30355c = kd.f20141b;
        this.f30356d = kd.f20142c;
        this.f30357e = kd.f20144e;
        this.f30358f = kd.f20145f;
        this.f30359g = kd.f20146g;
        this.f30360h = kd.f20147h;
        this.f30361i = kd.f20148i;
        this.f30362j = kd.f20151l;
        this.f30363k = kd.f20152m;
        this.f30364l = kd.f20149j;
        this.f30365m = kd.f20150k;
        this.f30366n = kd.f20153n;
        this.f30367o = kd.f20154o;
        this.f30368p = kd.f20155p;
    }
}
