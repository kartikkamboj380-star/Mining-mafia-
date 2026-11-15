package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: classes3.dex */
public class w implements p008a7.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f40686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f40687b;

    w(String str, int i10) {
        this.f40686a = str;
        this.f40687b = i10;
    }

    private String c() {
        return asString().trim();
    }

    private void d() {
        if (this.f40686a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // p008a7.n
    public int a() {
        return this.f40687b;
    }

    @Override // p008a7.n
    public boolean asBoolean() {
        if (this.f40687b == 0) {
            return false;
        }
        String strC = c();
        if (o.f40622f.matcher(strC).matches()) {
            return true;
        }
        if (o.f40623g.matcher(strC).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strC, "boolean"));
    }

    @Override // p008a7.n
    public double asDouble() {
        if (this.f40687b == 0) {
            return 0.0d;
        }
        String strC = c();
        try {
            return Double.valueOf(strC).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strC, "double"), e10);
        }
    }

    @Override // p008a7.n
    public String asString() {
        if (this.f40687b == 0) {
            return "";
        }
        d();
        return this.f40686a;
    }

    @Override // p008a7.n
    public long b() {
        if (this.f40687b == 0) {
            return 0L;
        }
        String strC = c();
        try {
            return Long.valueOf(strC).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strC, "long"), e10);
        }
    }
}
