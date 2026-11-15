package S0;

import android.net.Uri;
import android.os.Build;
import androidx.work.C1188c;
import androidx.work.EnumC1186a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f5349a = new B();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f5352c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f5353d;

        static {
            int[] iArr = new int[androidx.work.A.values().length];
            try {
                iArr[androidx.work.A.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.work.A.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.work.A.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.work.A.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.work.A.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.work.A.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f5350a = iArr;
            int[] iArr2 = new int[EnumC1186a.values().length];
            try {
                iArr2[EnumC1186a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1186a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            f5351b = iArr2;
            int[] iArr3 = new int[androidx.work.r.values().length];
            try {
                iArr3[androidx.work.r.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[androidx.work.r.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[androidx.work.r.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[androidx.work.r.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[androidx.work.r.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f5352c = iArr3;
            int[] iArr4 = new int[androidx.work.u.values().length];
            try {
                iArr4[androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[androidx.work.u.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            f5353d = iArr4;
        }
    }

    private B() {
    }

    public static final int a(EnumC1186a backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = a.f5351b[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new p129m8.k();
    }

    public static final Set b(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z9 = objectInputStream.readBoolean();
                        Intrinsics.checkNotNullExpressionValue(uri, "uri");
                        linkedHashSet.add(new C1188c.C0181c(uri, z9));
                    }
                    Unit unit = Unit.f45918a;
                    p229w8.c.a(objectInputStream, null);
                    Unit unit2 = Unit.f45918a;
                    p229w8.c.a(byteArrayInputStream, null);
                    return linkedHashSet;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p229w8.c.a(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p229w8.c.a(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final EnumC1186a c(int i10) {
        if (i10 == 0) {
            return EnumC1186a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC1186a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    public static final androidx.work.r d(int i10) {
        if (i10 == 0) {
            return androidx.work.r.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return androidx.work.r.CONNECTED;
        }
        if (i10 == 2) {
            return androidx.work.r.UNMETERED;
        }
        if (i10 == 3) {
            return androidx.work.r.NOT_ROAMING;
        }
        if (i10 == 4) {
            return androidx.work.r.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return androidx.work.r.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    public static final androidx.work.u e(int i10) {
        if (i10 == 0) {
            return androidx.work.u.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return androidx.work.u.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    public static final androidx.work.A f(int i10) {
        if (i10 == 0) {
            return androidx.work.A.ENQUEUED;
        }
        if (i10 == 1) {
            return androidx.work.A.RUNNING;
        }
        if (i10 == 2) {
            return androidx.work.A.SUCCEEDED;
        }
        if (i10 == 3) {
            return androidx.work.A.FAILED;
        }
        if (i10 == 4) {
            return androidx.work.A.BLOCKED;
        }
        if (i10 == 5) {
            return androidx.work.A.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    public static final int g(androidx.work.r networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = a.f5352c[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.r.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static final int h(androidx.work.u policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = a.f5353d[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new p129m8.k();
    }

    public static final byte[] i(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    C1188c.C0181c c0181c = (C1188c.C0181c) it.next();
                    objectOutputStream.writeUTF(c0181c.a().toString());
                    objectOutputStream.writeBoolean(c0181c.b());
                }
                Unit unit = Unit.f45918a;
                p229w8.c.a(objectOutputStream, null);
                p229w8.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    p229w8.c.a(objectOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                p229w8.c.a(byteArrayOutputStream, th3);
                throw th4;
            }
        }
    }

    public static final int j(androidx.work.A state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (a.f5350a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new p129m8.k();
        }
    }
}
