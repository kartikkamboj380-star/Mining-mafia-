package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f41281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r f41282b;

    private static final class b extends r {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f41283c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super();
        }

        static List f(Object obj, long j10) {
            return (List) V.H(obj, j10);
        }

        private static List g(Object obj, long j10, int i10) {
            List listMutableCopyWithCapacity2;
            List listF = f(obj, j10);
            if (listF.isEmpty()) {
                if (listF instanceof LazyStringList) {
                    listMutableCopyWithCapacity2 = new LazyStringArrayList(i10);
                } else {
                    listMutableCopyWithCapacity2 = ((listF instanceof H) && (listF instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) listF).mutableCopyWithCapacity2(i10) : new ArrayList(i10);
                }
                V.Y(obj, j10, listMutableCopyWithCapacity2);
                return listMutableCopyWithCapacity2;
            }
            if (f41283c.isAssignableFrom(listF.getClass())) {
                ArrayList arrayList = new ArrayList(listF.size() + i10);
                arrayList.addAll(listF);
                V.Y(obj, j10, arrayList);
                return arrayList;
            }
            if (listF instanceof UnmodifiableLazyStringList) {
                LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(listF.size() + i10);
                lazyStringArrayList.addAll((UnmodifiableLazyStringList) listF);
                V.Y(obj, j10, lazyStringArrayList);
                return lazyStringArrayList;
            }
            if ((listF instanceof H) && (listF instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) listF;
                if (!protobufList.isModifiable()) {
                    Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(listF.size() + i10);
                    V.Y(obj, j10, protobufListMutableCopyWithCapacity2);
                    return protobufListMutableCopyWithCapacity2;
                }
            }
            return listF;
        }

        @Override // com.google.protobuf.r
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) V.H(obj, j10);
            if (list instanceof LazyStringList) {
                objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
            } else {
                if (f41283c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof H) && (list instanceof Internal.ProtobufList)) {
                    Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                    if (protobufList.isModifiable()) {
                        protobufList.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            V.Y(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.r
        void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            V.Y(obj, j10, listF);
        }

        @Override // com.google.protobuf.r
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends r {
        private c() {
            super();
        }

        static Internal.ProtobufList f(Object obj, long j10) {
            return (Internal.ProtobufList) V.H(obj, j10);
        }

        @Override // com.google.protobuf.r
        void c(Object obj, long j10) {
            f(obj, j10).makeImmutable();
        }

        @Override // com.google.protobuf.r
        void d(Object obj, Object obj2, long j10) {
            Internal.ProtobufList protobufListF = f(obj, j10);
            Internal.ProtobufList protobufListF2 = f(obj2, j10);
            int size = protobufListF.size();
            int size2 = protobufListF2.size();
            if (size > 0 && size2 > 0) {
                if (!protobufListF.isModifiable()) {
                    protobufListF = protobufListF.mutableCopyWithCapacity2(size2 + size);
                }
                protobufListF.addAll(protobufListF2);
            }
            if (size > 0) {
                protobufListF2 = protobufListF;
            }
            V.Y(obj, j10, protobufListF2);
        }

        @Override // com.google.protobuf.r
        List e(Object obj, long j10) {
            Internal.ProtobufList protobufListF = f(obj, j10);
            if (protobufListF.isModifiable()) {
                return protobufListF;
            }
            int size = protobufListF.size();
            Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufListF.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            V.Y(obj, j10, protobufListMutableCopyWithCapacity2);
            return protobufListMutableCopyWithCapacity2;
        }
    }

    static {
        f41281a = new b();
        f41282b = new c();
    }

    static r a() {
        return f41281a;
    }

    static r b() {
        return f41282b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);

    private r() {
    }
}
