package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class StructuralMessageInfo implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProtoSyntax f41188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f41190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final FieldInfo[] f41191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MessageLite f41192e;

    StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z9, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f41188a = protoSyntax;
        this.f41189b = z9;
        this.f41190c = iArr;
        this.f41191d = fieldInfoArr;
        this.f41192e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // com.google.protobuf.x
    public boolean a() {
        return this.f41189b;
    }

    @Override // com.google.protobuf.x
    public MessageLite b() {
        return this.f41192e;
    }

    public int[] c() {
        return this.f41190c;
    }

    public FieldInfo[] d() {
        return this.f41191d;
    }

    @Override // com.google.protobuf.x
    public ProtoSyntax getSyntax() {
        return this.f41188a;
    }

    public static final class Builder {
        private int[] checkInitialized;
        private Object defaultInstance;
        private final List<FieldInfo> fields;
        private boolean messageSetWireFormat;
        private ProtoSyntax syntax;
        private boolean wasBuilt;

        public Builder() {
            this.checkInitialized = null;
            this.fields = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            if (this.syntax == null) {
                throw new IllegalStateException("Must specify a proto syntax");
            }
            this.wasBuilt = true;
            Collections.sort(this.fields);
            return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
        }

        public void withCheckInitialized(int[] iArr) {
            this.checkInitialized = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.defaultInstance = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (this.wasBuilt) {
                throw new IllegalStateException("Builder can only build once");
            }
            this.fields.add(fieldInfo);
        }

        public void withMessageSetWireFormat(boolean z9) {
            this.messageSetWireFormat = z9;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
        }

        public Builder(int i10) {
            this.checkInitialized = null;
            this.fields = new ArrayList(i10);
        }
    }
}
