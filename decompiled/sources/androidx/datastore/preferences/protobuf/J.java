package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public interface J extends K {

    public interface a extends K, Cloneable {
        J buildPartial();
    }

    void b(AbstractC1113i abstractC1113i);

    int getSerializedSize();

    a newBuilderForType();
}
