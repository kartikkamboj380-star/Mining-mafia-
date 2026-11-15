package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1125v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J f9688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f9689b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C1125v {
        public a(String str) {
            super(str);
        }
    }

    public C1125v(String str) {
        super(str);
        this.f9688a = null;
    }

    static C1125v b() {
        return new C1125v("Protocol message end-group tag did not match expected tag.");
    }

    static C1125v c() {
        return new C1125v("Protocol message contained an invalid tag (zero).");
    }

    static C1125v d() {
        return new C1125v("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1125v f() {
        return new C1125v("CodedInputStream encountered a malformed varint.");
    }

    static C1125v g() {
        return new C1125v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1125v h() {
        return new C1125v("Failed to parse the message.");
    }

    static C1125v i() {
        return new C1125v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C1125v l() {
        return new C1125v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1125v m() {
        return new C1125v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f9689b;
    }

    void j() {
        this.f9689b = true;
    }

    public C1125v k(J j10) {
        this.f9688a = j10;
        return this;
    }

    public C1125v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f9688a = null;
    }
}
