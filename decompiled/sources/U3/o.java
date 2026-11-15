package U3;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public enum o {
    ALL { // from class: U3.o.a
        @Override // U3.o
        public int e() {
            return 8;
        }
    },
    LEFT { // from class: U3.o.i
        @Override // U3.o
        public int e() {
            return 0;
        }
    },
    RIGHT { // from class: U3.o.j
        @Override // U3.o
        public int e() {
            return 2;
        }
    },
    TOP { // from class: U3.o.l
        @Override // U3.o
        public int e() {
            return 1;
        }
    },
    BOTTOM { // from class: U3.o.e
        @Override // U3.o
        public int e() {
            return 3;
        }
    },
    START { // from class: U3.o.k
        @Override // U3.o
        public int e() {
            return 4;
        }
    },
    END { // from class: U3.o.g
        @Override // U3.o
        public int e() {
            return 5;
        }
    },
    HORIZONTAL { // from class: U3.o.h
        @Override // U3.o
        public int e() {
            return 6;
        }
    },
    VERTICAL { // from class: U3.o.m
        @Override // U3.o
        public int e() {
            return 7;
        }
    },
    BLOCK_START { // from class: U3.o.d
        @Override // U3.o
        public int e() {
            return 11;
        }
    },
    BLOCK_END { // from class: U3.o.c
        @Override // U3.o
        public int e() {
            return 10;
        }
    },
    BLOCK { // from class: U3.o.b
        @Override // U3.o
        public int e() {
            return 9;
        }
    };


    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5986w = p189s8.a.a(c());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f5972a = new f(null);

    public static final class f {
        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(int i10) {
            switch (i10) {
                case 0:
                    return o.LEFT;
                case 1:
                    return o.TOP;
                case 2:
                    return o.RIGHT;
                case 3:
                    return o.BOTTOM;
                case 4:
                    return o.START;
                case 5:
                    return o.END;
                case 6:
                    return o.HORIZONTAL;
                case 7:
                    return o.VERTICAL;
                case 8:
                    return o.ALL;
                case 9:
                    return o.BLOCK;
                case 10:
                    return o.BLOCK_END;
                case 11:
                    return o.BLOCK_START;
                default:
                    throw new IllegalArgumentException("Unknown spacing type: " + i10);
            }
        }

        private f() {
        }
    }

    /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static EnumEntries d() {
        return f5986w;
    }

    public abstract int e();
}
