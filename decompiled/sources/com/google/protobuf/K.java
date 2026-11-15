package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
final class K implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MessageLite f41122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f41124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f41125d;

    K(MessageLite messageLite, String str, Object[] objArr) {
        this.f41122a = messageLite;
        this.f41123b = str;
        this.f41124c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f41125d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f41125d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.x
    public boolean a() {
        return (this.f41125d & 2) == 2;
    }

    @Override // com.google.protobuf.x
    public MessageLite b() {
        return this.f41122a;
    }

    Object[] c() {
        return this.f41124c;
    }

    String d() {
        return this.f41123b;
    }

    @Override // com.google.protobuf.x
    public ProtoSyntax getSyntax() {
        int i10 = this.f41125d;
        if ((i10 & 1) != 0) {
            return ProtoSyntax.PROTO2;
        }
        return (i10 & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
