package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1129z implements InterfaceC1128y {
    C1129z() {
    }

    static AbstractC1124u.b d(Object obj, long j10) {
        return (AbstractC1124u.b) i0.z(obj, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1128y
    public void a(Object obj, long j10) {
        d(obj, j10).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1128y
    public void b(Object obj, Object obj2, long j10) {
        AbstractC1124u.b bVarD = d(obj, j10);
        AbstractC1124u.b bVarD2 = d(obj2, j10);
        int size = bVarD.size();
        int size2 = bVarD2.size();
        if (size > 0 && size2 > 0) {
            if (!bVarD.isModifiable()) {
                bVarD = bVarD.mutableCopyWithCapacity(size2 + size);
            }
            bVarD.addAll(bVarD2);
        }
        if (size > 0) {
            bVarD2 = bVarD;
        }
        i0.O(obj, j10, bVarD2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1128y
    public List c(Object obj, long j10) {
        AbstractC1124u.b bVarD = d(obj, j10);
        if (bVarD.isModifiable()) {
            return bVarD;
        }
        int size = bVarD.size();
        AbstractC1124u.b bVarMutableCopyWithCapacity = bVarD.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        i0.O(obj, j10, bVarMutableCopyWithCapacity);
        return bVarMutableCopyWithCapacity;
    }
}
