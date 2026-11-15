package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class A0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V0 f37046a;

    public A0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f37046a = null;
    }

    static C6484z0 a() {
        return new C6484z0("Protocol message tag had invalid wire type.");
    }

    static A0 b() {
        return new A0("Protocol message contained an invalid tag (zero).");
    }

    static A0 c() {
        return new A0("Protocol message had invalid UTF-8.");
    }

    static A0 d() {
        return new A0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static A0 e() {
        return new A0("Failed to parse the message.");
    }

    static A0 g() {
        return new A0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final A0 f(V0 v10) {
        this.f37046a = v10;
        return this;
    }

    public A0(String str) {
        super(str);
        this.f37046a = null;
    }
}
