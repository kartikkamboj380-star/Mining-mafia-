package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class LazyField extends LazyFieldLite {
    private final MessageLite defaultInstance;

    static class b implements Map.Entry {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry f41126a;

        public LazyField a() {
            return (LazyField) this.f41126a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f41126a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField lazyField = (LazyField) this.f41126a.getValue();
            if (lazyField == null) {
                return null;
            }
            return lazyField.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((LazyField) this.f41126a.getValue()).setValue((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry entry) {
            this.f41126a = entry;
        }
    }

    static class c implements Iterator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator f41127a;

        public c(Iterator it) {
            this.f41127a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f41127a.next();
            return entry.getValue() instanceof LazyField ? new b(entry) : entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f41127a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f41127a.remove();
        }
    }

    public LazyField(MessageLite messageLite, ExtensionRegistryLite extensionRegistryLite, ByteString byteString) {
        super(extensionRegistryLite, byteString);
        this.defaultInstance = messageLite;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.value == this.defaultInstance;
    }

    @Override // com.google.protobuf.LazyFieldLite
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public MessageLite getValue() {
        return getValue(this.defaultInstance);
    }

    @Override // com.google.protobuf.LazyFieldLite
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}
