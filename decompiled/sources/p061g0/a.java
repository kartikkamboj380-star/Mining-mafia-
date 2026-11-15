package p061g0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static SimpleDateFormat f44299T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static SimpleDateFormat f44300U;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final d[] f44304Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final d[] f44305Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final d[] f44306a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final d[] f44307b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final d[] f44308c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final d f44309d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final d[] f44310e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final d[] f44311f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final d[] f44312g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final d[] f44313h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    static final d[][] f44314i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final d[] f44315j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final HashMap[] f44316k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f44317l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final HashSet f44318m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final HashMap f44319n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final Charset f44320o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final byte[] f44321p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final byte[] f44322q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f44323r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f44324s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f44325t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f44327u0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileDescriptor f44334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f44335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap[] f44338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Set f44339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ByteOrder f44340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f44341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f44342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f44344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f44345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte[] f44346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f44347o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f44348p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f44349q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f44350r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f44351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f44352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final boolean f44326u = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final List f44328v = Arrays.asList(1, 6, 3, 8);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final List f44329w = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f44330x = {8, 8, 8};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f44331y = {4};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f44332z = {8};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    static final byte[] f44280A = {-1, -40, -1};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final byte[] f44281B = {102, 116, 121, 112};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final byte[] f44282C = {109, 105, 102, 49};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final byte[] f44283D = {104, 101, 105, 99};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final byte[] f44284E = {79, 76, 89, 77, 80, 0};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final byte[] f44285F = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final byte[] f44286G = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final byte[] f44287H = {101, 88, 73, 102};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final byte[] f44288I = {73, 72, 68, 82};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final byte[] f44289J = {73, 69, 78, 68};

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final byte[] f44290K = {82, 73, 70, 70};

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final byte[] f44291L = {87, 69, 66, 80};

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final byte[] f44292M = {69, 88, 73, 70};

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final byte[] f44293N = {-99, 1, 42};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final byte[] f44294O = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final byte[] f44295P = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final byte[] f44296Q = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final byte[] f44297R = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final byte[] f44298S = "ANMF".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    static final String[] f44301V = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    static final int[] f44302W = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    static final byte[] f44303X = {65, 83, 67, 73, 73, 0, 0, 0};

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f44363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f44364d;

        c(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static c a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f44320o0);
            return new c(2, bytes.length, bytes);
        }

        public static c b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static c c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f44302W[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new c(4, jArr.length, byteBufferWrap.array());
        }

        public static c d(e eVar, ByteOrder byteOrder) {
            return e(new e[]{eVar}, byteOrder);
        }

        public static c e(e[] eVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f44302W[5] * eVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (e eVar : eVarArr) {
                byteBufferWrap.putInt((int) eVar.f44369a);
                byteBufferWrap.putInt((int) eVar.f44370b);
            }
            return new c(5, eVarArr.length, byteBufferWrap.array());
        }

        public static c f(int i10, ByteOrder byteOrder) {
            return g(new int[]{i10}, byteOrder);
        }

        public static c g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.f44302W[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new c(3, iArr.length, byteBufferWrap.array());
        }

        public double h(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof e[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            e[] eVarArr = (e[]) objK;
            if (eVarArr.length == 1) {
                return eVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb = new StringBuilder();
            int i10 = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objK instanceof e[])) {
                return null;
            }
            e[] eVarArr = (e[]) objK;
            while (i10 < eVarArr.length) {
                sb.append(eVarArr[i10].f44369a);
                sb.append('/');
                sb.append(eVarArr[i10].f44370b);
                i10++;
                if (i10 != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
        Object k(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f44364d);
                    try {
                        bVar.j(byteOrder);
                        int length = 0;
                        switch (this.f44361a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f44364d;
                                if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                    str = new String(new char[]{(char) (b10 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f44320o0);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f44362b >= a.f44303X.length) {
                                    int i10 = 0;
                                    while (true) {
                                        byte[] bArr2 = a.f44303X;
                                        if (i10 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (this.f44364d[i10] == bArr2[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < this.f44362b && (b11 = this.f44364d[length]) != 0) {
                                    if (b11 >= 32) {
                                        sb.append((char) b11);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                str = sb.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.f44362b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f44362b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f44362b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f44362b) {
                                        jArr[length] = bVar.h();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                e[] eVarArr = new e[this.f44362b];
                                while (true) {
                                    str = eVarArr;
                                    if (length < this.f44362b) {
                                        eVarArr[length] = new e(bVar.h(), bVar.h());
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f44362b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f44362b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f44362b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f44362b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                e[] eVarArr2 = new e[this.f44362b];
                                while (true) {
                                    str = eVarArr2;
                                    if (length < this.f44362b) {
                                        eVarArr2[length] = new e(bVar.readInt(), bVar.readInt());
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f44362b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f44362b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f44362b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f44362b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            return str;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public String toString() {
            return "(" + a.f44301V[this.f44361a] + ", data length:" + this.f44364d.length + ")";
        }

        c(int i10, int i11, long j10, byte[] bArr) {
            this.f44361a = i10;
            this.f44362b = i11;
            this.f44363c = j10;
            this.f44364d = bArr;
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f44369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f44370b;

        e(long j10, long j11) {
            if (j11 == 0) {
                this.f44369a = 0L;
                this.f44370b = 1L;
            } else {
                this.f44369a = j10;
                this.f44370b = j11;
            }
        }

        public double a() {
            return this.f44369a / this.f44370b;
        }

        public String toString() {
            return this.f44369a + "/" + this.f44370b;
        }
    }

    static {
        d[] dVarArr = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new d("ImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("Orientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("SensorTopBorder", 4, 4), new d("SensorLeftBorder", 5, 4), new d("SensorBottomBorder", 6, 4), new d("SensorRightBorder", 7, 4), new d("ISO", 23, 3), new d("JpgFromRaw", 46, 7), new d("Xmp", 700, 1)};
        f44304Y = dVarArr;
        d[] dVarArr2 = {new d("ExposureTime", 33434, 5), new d("FNumber", 33437, 5), new d("ExposureProgram", 34850, 3), new d("SpectralSensitivity", 34852, 2), new d("PhotographicSensitivity", 34855, 3), new d("OECF", 34856, 7), new d("SensitivityType", 34864, 3), new d("StandardOutputSensitivity", 34865, 4), new d("RecommendedExposureIndex", 34866, 4), new d("ISOSpeed", 34867, 4), new d("ISOSpeedLatitudeyyy", 34868, 4), new d("ISOSpeedLatitudezzz", 34869, 4), new d("ExifVersion", 36864, 2), new d("DateTimeOriginal", 36867, 2), new d("DateTimeDigitized", 36868, 2), new d("OffsetTime", 36880, 2), new d("OffsetTimeOriginal", 36881, 2), new d("OffsetTimeDigitized", 36882, 2), new d("ComponentsConfiguration", 37121, 7), new d("CompressedBitsPerPixel", 37122, 5), new d("ShutterSpeedValue", 37377, 10), new d("ApertureValue", 37378, 5), new d("BrightnessValue", 37379, 10), new d("ExposureBiasValue", 37380, 10), new d("MaxApertureValue", 37381, 5), new d("SubjectDistance", 37382, 5), new d("MeteringMode", 37383, 3), new d("LightSource", 37384, 3), new d("Flash", 37385, 3), new d("FocalLength", 37386, 5), new d("SubjectArea", 37396, 3), new d("MakerNote", 37500, 7), new d("UserComment", 37510, 7), new d("SubSecTime", 37520, 2), new d("SubSecTimeOriginal", 37521, 2), new d("SubSecTimeDigitized", 37522, 2), new d("FlashpixVersion", 40960, 7), new d("ColorSpace", 40961, 3), new d("PixelXDimension", 40962, 3, 4), new d("PixelYDimension", 40963, 3, 4), new d("RelatedSoundFile", 40964, 2), new d("InteroperabilityIFDPointer", 40965, 4), new d("FlashEnergy", 41483, 5), new d("SpatialFrequencyResponse", 41484, 7), new d("FocalPlaneXResolution", 41486, 5), new d("FocalPlaneYResolution", 41487, 5), new d("FocalPlaneResolutionUnit", 41488, 3), new d("SubjectLocation", 41492, 3), new d("ExposureIndex", 41493, 5), new d("SensingMethod", 41495, 3), new d("FileSource", 41728, 7), new d("SceneType", 41729, 7), new d("CFAPattern", 41730, 7), new d("CustomRendered", 41985, 3), new d("ExposureMode", 41986, 3), new d("WhiteBalance", 41987, 3), new d("DigitalZoomRatio", 41988, 5), new d("FocalLengthIn35mmFilm", 41989, 3), new d("SceneCaptureType", 41990, 3), new d("GainControl", 41991, 3), new d("Contrast", 41992, 3), new d("Saturation", 41993, 3), new d("Sharpness", 41994, 3), new d("DeviceSettingDescription", 41995, 7), new d("SubjectDistanceRange", 41996, 3), new d("ImageUniqueID", 42016, 2), new d("CameraOwnerName", 42032, 2), new d("BodySerialNumber", 42033, 2), new d("LensSpecification", 42034, 5), new d("LensMake", 42035, 2), new d("LensModel", 42036, 2), new d("Gamma", 42240, 5), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f44305Z = dVarArr2;
        d[] dVarArr3 = {new d("GPSVersionID", 0, 1), new d("GPSLatitudeRef", 1, 2), new d("GPSLatitude", 2, 5, 10), new d("GPSLongitudeRef", 3, 2), new d("GPSLongitude", 4, 5, 10), new d("GPSAltitudeRef", 5, 1), new d("GPSAltitude", 6, 5), new d("GPSTimeStamp", 7, 5), new d("GPSSatellites", 8, 2), new d("GPSStatus", 9, 2), new d("GPSMeasureMode", 10, 2), new d("GPSDOP", 11, 5), new d("GPSSpeedRef", 12, 2), new d("GPSSpeed", 13, 5), new d("GPSTrackRef", 14, 2), new d("GPSTrack", 15, 5), new d("GPSImgDirectionRef", 16, 2), new d("GPSImgDirection", 17, 5), new d("GPSMapDatum", 18, 2), new d("GPSDestLatitudeRef", 19, 2), new d("GPSDestLatitude", 20, 5), new d("GPSDestLongitudeRef", 21, 2), new d("GPSDestLongitude", 22, 5), new d("GPSDestBearingRef", 23, 2), new d("GPSDestBearing", 24, 5), new d("GPSDestDistanceRef", 25, 2), new d("GPSDestDistance", 26, 5), new d("GPSProcessingMethod", 27, 7), new d("GPSAreaInformation", 28, 7), new d("GPSDateStamp", 29, 2), new d("GPSDifferential", 30, 3), new d("GPSHPositioningError", 31, 5)};
        f44306a0 = dVarArr3;
        d[] dVarArr4 = {new d("InteroperabilityIndex", 1, 2)};
        f44307b0 = dVarArr4;
        d[] dVarArr5 = {new d("NewSubfileType", 254, 4), new d("SubfileType", 255, 4), new d("ThumbnailImageWidth", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 3, 4), new d("ThumbnailImageLength", 257, 3, 4), new d("BitsPerSample", 258, 3), new d("Compression", 259, 3), new d("PhotometricInterpretation", 262, 3), new d("ImageDescription", 270, 2), new d("Make", 271, 2), new d("Model", 272, 2), new d("StripOffsets", 273, 3, 4), new d("ThumbnailOrientation", 274, 3), new d("SamplesPerPixel", 277, 3), new d("RowsPerStrip", 278, 3, 4), new d("StripByteCounts", 279, 3, 4), new d("XResolution", 282, 5), new d("YResolution", 283, 5), new d("PlanarConfiguration", 284, 3), new d("ResolutionUnit", 296, 3), new d("TransferFunction", 301, 3), new d("Software", 305, 2), new d("DateTime", 306, 2), new d("Artist", 315, 2), new d("WhitePoint", 318, 5), new d("PrimaryChromaticities", 319, 5), new d("SubIFDPointer", 330, 4), new d("JPEGInterchangeFormat", 513, 4), new d("JPEGInterchangeFormatLength", 514, 4), new d("YCbCrCoefficients", 529, 5), new d("YCbCrSubSampling", 530, 3), new d("YCbCrPositioning", 531, 3), new d("ReferenceBlackWhite", 532, 5), new d("Copyright", 33432, 2), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("DNGVersion", 50706, 1), new d("DefaultCropSize", 50720, 3, 4)};
        f44308c0 = dVarArr5;
        f44309d0 = new d("StripOffsets", 273, 3);
        d[] dVarArr6 = {new d("ThumbnailImage", IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, 7), new d("CameraSettingsIFDPointer", 8224, 4), new d("ImageProcessingIFDPointer", 8256, 4)};
        f44310e0 = dVarArr6;
        d[] dVarArr7 = {new d("PreviewImageStart", 257, 4), new d("PreviewImageLength", 258, 4)};
        f44311f0 = dVarArr7;
        d[] dVarArr8 = {new d("AspectFrame", 4371, 3)};
        f44312g0 = dVarArr8;
        d[] dVarArr9 = {new d("ColorSpace", 55, 3)};
        f44313h0 = dVarArr9;
        d[][] dVarArr10 = {dVarArr, dVarArr2, dVarArr3, dVarArr4, dVarArr5, dVarArr, dVarArr6, dVarArr7, dVarArr8, dVarArr9};
        f44314i0 = dVarArr10;
        f44315j0 = new d[]{new d("SubIFDPointer", 330, 4), new d("ExifIFDPointer", 34665, 4), new d("GPSInfoIFDPointer", 34853, 4), new d("InteroperabilityIFDPointer", 40965, 4), new d("CameraSettingsIFDPointer", 8224, 1), new d("ImageProcessingIFDPointer", 8256, 1)};
        f44316k0 = new HashMap[dVarArr10.length];
        f44317l0 = new HashMap[dVarArr10.length];
        f44318m0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f44319n0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f44320o0 = charsetForName;
        f44321p0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f44322q0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f44299T = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f44300U = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            d[][] dVarArr11 = f44314i0;
            if (i10 >= dVarArr11.length) {
                HashMap map = f44319n0;
                d[] dVarArr12 = f44315j0;
                map.put(Integer.valueOf(dVarArr12[0].f44365a), 5);
                map.put(Integer.valueOf(dVarArr12[1].f44365a), 1);
                map.put(Integer.valueOf(dVarArr12[2].f44365a), 2);
                map.put(Integer.valueOf(dVarArr12[3].f44365a), 3);
                map.put(Integer.valueOf(dVarArr12[4].f44365a), 7);
                map.put(Integer.valueOf(dVarArr12[5].f44365a), 8);
                f44323r0 = Pattern.compile(".*[1-9].*");
                f44324s0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f44325t0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f44327u0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f44316k0[i10] = new HashMap();
            f44317l0[i10] = new HashMap();
            for (d dVar : dVarArr11[i10]) {
                f44316k0[i10].put(Integer.valueOf(dVar.f44365a), dVar);
                f44317l0[i10].put(dVar.f44366b, dVar);
            }
            i10++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(HashMap map) {
        c cVar;
        int i10;
        c cVar2 = (c) map.get("BitsPerSample");
        if (cVar2 != null) {
            int[] iArr = (int[]) cVar2.k(this.f44340h);
            int[] iArr2 = f44330x;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f44336d == 3 && (cVar = (c) map.get("PhotometricInterpretation")) != null && (((i10 = cVar.i(this.f44340h)) == 1 && Arrays.equals(iArr, f44332z)) || (i10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f44326u) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private boolean B(HashMap map) {
        c cVar = (c) map.get("ImageLength");
        c cVar2 = (c) map.get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            return false;
        }
        return cVar.i(this.f44340h) <= 512 && cVar2.i(this.f44340h) <= 512;
    }

    private boolean C(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f44290K;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f44291L;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f44290K.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    private void D(InputStream inputStream) {
        boolean z9;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f44314i0.length; i10++) {
            try {
                try {
                    this.f44338f[i10] = new HashMap();
                } catch (Throwable th) {
                    a();
                    if (f44326u) {
                        F();
                    }
                    throw th;
                }
            } catch (IOException e10) {
                e = e10;
                z9 = f44326u;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z9) {
                    F();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z9 = f44326u;
                if (z9) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z9) {
                    F();
                    return;
                }
                return;
            }
        }
        if (!this.f44337e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f44336d = g(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (M(this.f44336d)) {
            f fVar = new f(inputStream);
            if (this.f44337e) {
                n(fVar);
            } else {
                int i11 = this.f44336d;
                if (i11 == 12) {
                    e(fVar);
                } else if (i11 == 7) {
                    h(fVar);
                } else if (i11 == 10) {
                    m(fVar);
                } else {
                    k(fVar);
                }
            }
            fVar.v(this.f44348p);
            L(fVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f44336d;
            if (i12 == 4) {
                f(bVar, 0, 0);
            } else if (i12 == 13) {
                i(bVar);
            } else if (i12 == 9) {
                j(bVar);
            } else if (i12 == 14) {
                o(bVar);
            }
        }
        a();
        if (f44326u) {
            F();
        }
    }

    private void E(b bVar) throws IOException {
        ByteOrder byteOrderG = G(bVar);
        this.f44340h = byteOrderG;
        bVar.j(byteOrderG);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f44336d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.n(i12);
        }
    }

    private void F() {
        for (int i10 = 0; i10 < this.f44338f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f44338f[i10].size());
            for (Map.Entry entry : this.f44338f[i10].entrySet()) {
                c cVar = (c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + cVar.toString() + ", tagValue: '" + cVar.j(this.f44340h) + "'");
            }
        }
    }

    private ByteOrder G(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f44326u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f44326u) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    private void H(byte[] bArr, int i10) throws IOException {
        f fVar = new f(bArr);
        E(fVar);
        I(fVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0287  */
    /* JADX WARN: Code duplicated, block: B:102:0x029e  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0307  */
    /* JADX WARN: Code duplicated, block: B:121:0x0333  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0138  */
    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0144  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:77:0x0202  */
    /* JADX WARN: Code duplicated, block: B:82:0x020f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0214  */
    /* JADX WARN: Code duplicated, block: B:84:0x0219  */
    /* JADX WARN: Code duplicated, block: B:86:0x0220  */
    /* JADX WARN: Code duplicated, block: B:89:0x023a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x0287, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:102:0x029e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0144, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01d5, please report this as an issue */
    private void I(f fVar, int i10) throws IOException {
        int i11;
        d dVar;
        long j10;
        boolean z9;
        boolean z10;
        d dVar2;
        Integer num;
        d dVar3;
        long j11;
        int unsignedShort;
        long jH;
        String str;
        int i12;
        this.f44339g.add(Integer.valueOf(fVar.c()));
        short s10 = fVar.readShort();
        if (f44326u) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s10));
        }
        if (s10 <= 0) {
            return;
        }
        short s11 = 0;
        while (s11 < s10) {
            int unsignedShort2 = fVar.readUnsignedShort();
            int unsignedShort3 = fVar.readUnsignedShort();
            int i13 = fVar.readInt();
            long jC = ((long) fVar.c()) + 4;
            d dVar4 = (d) f44316k0[i10].get(Integer.valueOf(unsignedShort2));
            boolean z11 = f44326u;
            if (z11) {
                i11 = 4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), dVar4 != null ? dVar4.f44366b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                i11 = 4;
            }
            if (dVar4 != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = f44302W;
                    if (unsignedShort3 < iArr.length) {
                        if (dVar4.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = dVar4.f44367c;
                            }
                            dVar = dVar4;
                            j10 = ((long) i13) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                        } else if (z11) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + f44301V[unsignedShort3] + ") is unexpected for tag: " + dVar4.f44366b);
                        }
                    }
                    if (z9) {
                        if (j10 > 4) {
                            i12 = fVar.readInt();
                            if (z11) {
                                Log.d("ExifInterface", "seek to data offset: " + i12);
                            }
                            if (this.f44336d == 7) {
                                z10 = z11;
                                dVar2 = dVar;
                                if ("MakerNote".equals(dVar2.f44366b)) {
                                    this.f44349q = i12;
                                } else if (i10 != 6 && "ThumbnailImage".equals(dVar2.f44366b)) {
                                    this.f44350r = i12;
                                    this.f44351s = i13;
                                    c cVarF = c.f(6, this.f44340h);
                                    c cVarB = c.b(this.f44350r, this.f44340h);
                                    c cVarB2 = c.b(this.f44351s, this.f44340h);
                                    this.f44338f[i11].put("Compression", cVarF);
                                    this.f44338f[i11].put("JPEGInterchangeFormat", cVarB);
                                    this.f44338f[i11].put("JPEGInterchangeFormatLength", cVarB2);
                                }
                            } else {
                                z10 = z11;
                                dVar2 = dVar;
                            }
                            fVar.v(i12);
                        } else {
                            z10 = z11;
                            jC = jC;
                            dVar2 = dVar;
                        }
                        num = (Integer) f44319n0.get(Integer.valueOf(unsignedShort2));
                        if (z10) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i11) {
                                    jH = fVar.h();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = fVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = fVar.readInt();
                                } else {
                                    jH = -1;
                                }
                                if (z10) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                                }
                                if (jH > 0 || (fVar.a() != -1 && jH >= fVar.a())) {
                                    if (z10) {
                                        str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                        if (fVar.a() != -1) {
                                            str = str + " (total length: " + fVar.a() + ")";
                                        }
                                        Log.d("ExifInterface", str);
                                    }
                                } else if (!this.f44339g.contains(Integer.valueOf((int) jH))) {
                                    fVar.v(jH);
                                    I(fVar, num.intValue());
                                } else if (z10) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + ")");
                                }
                                fVar.v(jC);
                            } else {
                                unsignedShort = fVar.readUnsignedShort();
                            }
                            jH = unsignedShort;
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                            }
                            if (jH > 0) {
                                if (z10) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                    if (fVar.a() != -1) {
                                        str = str + " (total length: " + fVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.v(jC);
                        } else {
                            int iC = fVar.c() + this.f44348p;
                            byte[] bArr = new byte[(int) j10];
                            fVar.readFully(bArr);
                            long j12 = iC;
                            dVar3 = dVar2;
                            j11 = jC;
                            c cVar = new c(unsignedShort3, i13, j12, bArr);
                            this.f44338f[i10].put(dVar3.f44366b, cVar);
                            if ("DNGVersion".equals(dVar3.f44366b)) {
                                this.f44336d = 3;
                            }
                            if (((!"Make".equals(dVar3.f44366b) || "Model".equals(dVar3.f44366b)) && cVar.j(this.f44340h).contains("PENTAX")) || ("Compression".equals(dVar3.f44366b) && cVar.i(this.f44340h) == 65535)) {
                                this.f44336d = 8;
                            }
                            if (fVar.c() != j11) {
                                fVar.v(j11);
                            }
                        }
                    } else {
                        fVar.v(jC);
                    }
                    s11 = (short) (s11 + 1);
                    s10 = s10;
                }
                dVar = dVar4;
                if (z11) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z9 = false;
                if (z9) {
                    fVar.v(jC);
                } else {
                    if (j10 > 4) {
                        i12 = fVar.readInt();
                        if (z11) {
                            Log.d("ExifInterface", "seek to data offset: " + i12);
                        }
                        if (this.f44336d == 7) {
                            z10 = z11;
                            dVar2 = dVar;
                            if ("MakerNote".equals(dVar2.f44366b)) {
                                this.f44349q = i12;
                            } else if (i10 != 6) {
                            }
                        } else {
                            z10 = z11;
                            dVar2 = dVar;
                        }
                        fVar.v(i12);
                    } else {
                        z10 = z11;
                        jC = jC;
                        dVar2 = dVar;
                    }
                    num = (Integer) f44319n0.get(Integer.valueOf(unsignedShort2));
                    if (z10) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i11) {
                                jH = fVar.h();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = fVar.readInt();
                            } else {
                                unsignedShort = fVar.readShort();
                            }
                            if (z10) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                            }
                            if (jH > 0) {
                                if (z10) {
                                    str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                    if (fVar.a() != -1) {
                                        str = str + " (total length: " + fVar.a() + ")";
                                    }
                                    Log.d("ExifInterface", str);
                                }
                            } else if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                            fVar.v(jC);
                        } else {
                            unsignedShort = fVar.readUnsignedShort();
                        }
                        jH = unsignedShort;
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                        }
                        if (jH > 0) {
                            if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jH;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.v(jC);
                    } else {
                        int iC2 = fVar.c() + this.f44348p;
                        byte[] bArr2 = new byte[(int) j10];
                        fVar.readFully(bArr2);
                        long j13 = iC2;
                        dVar3 = dVar2;
                        j11 = jC;
                        c cVar2 = new c(unsignedShort3, i13, j13, bArr2);
                        this.f44338f[i10].put(dVar3.f44366b, cVar2);
                        if ("DNGVersion".equals(dVar3.f44366b)) {
                            this.f44336d = 3;
                        }
                        if (!"Make".equals(dVar3.f44366b)) {
                        }
                        this.f44336d = 8;
                        if (fVar.c() != j11) {
                            fVar.v(j11);
                        }
                    }
                }
                s11 = (short) (s11 + 1);
                s10 = s10;
            } else if (z11) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            dVar = dVar4;
            j10 = 0;
            z9 = false;
            if (z9) {
                fVar.v(jC);
            } else {
                if (j10 > 4) {
                    i12 = fVar.readInt();
                    if (z11) {
                        Log.d("ExifInterface", "seek to data offset: " + i12);
                    }
                    if (this.f44336d == 7) {
                        z10 = z11;
                        dVar2 = dVar;
                        if ("MakerNote".equals(dVar2.f44366b)) {
                            this.f44349q = i12;
                        } else if (i10 != 6) {
                        }
                    } else {
                        z10 = z11;
                        dVar2 = dVar;
                    }
                    fVar.v(i12);
                } else {
                    z10 = z11;
                    jC = jC;
                    dVar2 = dVar;
                }
                num = (Integer) f44319n0.get(Integer.valueOf(unsignedShort2));
                if (z10) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jH = fVar.h();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = fVar.readInt();
                        } else {
                            unsignedShort = fVar.readShort();
                        }
                        if (z10) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                        }
                        if (jH > 0) {
                            if (z10) {
                                str = "Skip jump into the IFD since its offset is invalid: " + jH;
                                if (fVar.a() != -1) {
                                    str = str + " (total length: " + fVar.a() + ")";
                                }
                                Log.d("ExifInterface", str);
                            }
                        } else if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jH;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                        fVar.v(jC);
                    } else {
                        unsignedShort = fVar.readUnsignedShort();
                    }
                    jH = unsignedShort;
                    if (z10) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(jH), dVar2.f44366b));
                    }
                    if (jH > 0) {
                        if (z10) {
                            str = "Skip jump into the IFD since its offset is invalid: " + jH;
                            if (fVar.a() != -1) {
                                str = str + " (total length: " + fVar.a() + ")";
                            }
                            Log.d("ExifInterface", str);
                        }
                    } else if (z10) {
                        str = "Skip jump into the IFD since its offset is invalid: " + jH;
                        if (fVar.a() != -1) {
                            str = str + " (total length: " + fVar.a() + ")";
                        }
                        Log.d("ExifInterface", str);
                    }
                    fVar.v(jC);
                } else {
                    int iC3 = fVar.c() + this.f44348p;
                    byte[] bArr3 = new byte[(int) j10];
                    fVar.readFully(bArr3);
                    long j14 = iC3;
                    dVar3 = dVar2;
                    j11 = jC;
                    c cVar3 = new c(unsignedShort3, i13, j14, bArr3);
                    this.f44338f[i10].put(dVar3.f44366b, cVar3);
                    if ("DNGVersion".equals(dVar3.f44366b)) {
                        this.f44336d = 3;
                    }
                    if (!"Make".equals(dVar3.f44366b)) {
                    }
                    this.f44336d = 8;
                    if (fVar.c() != j11) {
                        fVar.v(j11);
                    }
                }
            }
            s11 = (short) (s11 + 1);
            s10 = s10;
        }
        int i14 = fVar.readInt();
        boolean z12 = f44326u;
        if (z12) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i14)));
        }
        long j15 = i14;
        if (j15 <= 0) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        if (this.f44339g.contains(Integer.valueOf(i14))) {
            if (z12) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        fVar.v(j15);
        if (this.f44338f[4].isEmpty()) {
            I(fVar, 4);
        } else if (this.f44338f[5].isEmpty()) {
            I(fVar, 5);
        }
    }

    private void J(int i10, String str, String str2) {
        if (this.f44338f[i10].isEmpty() || this.f44338f[i10].get(str) == null) {
            return;
        }
        HashMap map = this.f44338f[i10];
        map.put(str2, map.get(str));
        this.f44338f[i10].remove(str);
    }

    private void K(f fVar, int i10) throws Throwable {
        c cVar = (c) this.f44338f[i10].get("ImageLength");
        c cVar2 = (c) this.f44338f[i10].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            c cVar3 = (c) this.f44338f[i10].get("JPEGInterchangeFormat");
            c cVar4 = (c) this.f44338f[i10].get("JPEGInterchangeFormatLength");
            if (cVar3 == null || cVar4 == null) {
                return;
            }
            int i11 = cVar3.i(this.f44340h);
            int i12 = cVar3.i(this.f44340h);
            fVar.v(i11);
            byte[] bArr = new byte[i12];
            fVar.readFully(bArr);
            f(new b(bArr), i11, i10);
        }
    }

    private void L(b bVar) throws Throwable {
        HashMap map = this.f44338f[4];
        c cVar = (c) map.get("Compression");
        if (cVar == null) {
            this.f44347o = 6;
            p(bVar, map);
            return;
        }
        int i10 = cVar.i(this.f44340h);
        this.f44347o = i10;
        if (i10 != 1) {
            if (i10 == 6) {
                p(bVar, map);
                return;
            } else if (i10 != 7) {
                return;
            }
        }
        if (A(map)) {
            q(bVar, map);
        }
    }

    private static boolean M(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void N(int i10, int i11) throws Throwable {
        if (this.f44338f[i10].isEmpty() || this.f44338f[i11].isEmpty()) {
            if (f44326u) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        c cVar = (c) this.f44338f[i10].get("ImageLength");
        c cVar2 = (c) this.f44338f[i10].get("ImageWidth");
        c cVar3 = (c) this.f44338f[i11].get("ImageLength");
        c cVar4 = (c) this.f44338f[i11].get("ImageWidth");
        if (cVar == null || cVar2 == null) {
            if (f44326u) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (cVar3 == null || cVar4 == null) {
            if (f44326u) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i12 = cVar.i(this.f44340h);
        int i13 = cVar2.i(this.f44340h);
        int i14 = cVar3.i(this.f44340h);
        int i15 = cVar4.i(this.f44340h);
        if (i12 >= i14 || i13 >= i15) {
            return;
        }
        HashMap[] mapArr = this.f44338f;
        HashMap map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    private void O(f fVar, int i10) throws Throwable {
        c cVarF;
        c cVarF2;
        c cVar = (c) this.f44338f[i10].get("DefaultCropSize");
        c cVar2 = (c) this.f44338f[i10].get("SensorTopBorder");
        c cVar3 = (c) this.f44338f[i10].get("SensorLeftBorder");
        c cVar4 = (c) this.f44338f[i10].get("SensorBottomBorder");
        c cVar5 = (c) this.f44338f[i10].get("SensorRightBorder");
        if (cVar == null) {
            if (cVar2 == null || cVar3 == null || cVar4 == null || cVar5 == null) {
                K(fVar, i10);
                return;
            }
            int i11 = cVar2.i(this.f44340h);
            int i12 = cVar4.i(this.f44340h);
            int i13 = cVar5.i(this.f44340h);
            int i14 = cVar3.i(this.f44340h);
            if (i12 <= i11 || i13 <= i14) {
                return;
            }
            c cVarF3 = c.f(i12 - i11, this.f44340h);
            c cVarF4 = c.f(i13 - i14, this.f44340h);
            this.f44338f[i10].put("ImageLength", cVarF3);
            this.f44338f[i10].put("ImageWidth", cVarF4);
            return;
        }
        if (cVar.f44361a == 5) {
            e[] eVarArr = (e[]) cVar.k(this.f44340h);
            if (eVarArr == null || eVarArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(eVarArr));
                return;
            }
            cVarF = c.d(eVarArr[0], this.f44340h);
            cVarF2 = c.d(eVarArr[1], this.f44340h);
        } else {
            int[] iArr = (int[]) cVar.k(this.f44340h);
            if (iArr == null || iArr.length != 2) {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            cVarF = c.f(iArr[0], this.f44340h);
            cVarF2 = c.f(iArr[1], this.f44340h);
        }
        this.f44338f[i10].put("ImageWidth", cVarF);
        this.f44338f[i10].put("ImageLength", cVarF2);
    }

    private void P() throws Throwable {
        N(0, 5);
        N(0, 4);
        N(5, 4);
        c cVar = (c) this.f44338f[1].get("PixelXDimension");
        c cVar2 = (c) this.f44338f[1].get("PixelYDimension");
        if (cVar != null && cVar2 != null) {
            this.f44338f[0].put("ImageWidth", cVar);
            this.f44338f[0].put("ImageLength", cVar2);
        }
        if (this.f44338f[4].isEmpty() && B(this.f44338f[5])) {
            HashMap[] mapArr = this.f44338f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!B(this.f44338f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        J(0, "ThumbnailOrientation", "Orientation");
        J(0, "ThumbnailImageLength", "ImageLength");
        J(0, "ThumbnailImageWidth", "ImageWidth");
        J(5, "ThumbnailOrientation", "Orientation");
        J(5, "ThumbnailImageLength", "ImageLength");
        J(5, "ThumbnailImageWidth", "ImageWidth");
        J(4, "Orientation", "ThumbnailOrientation");
        J(4, "ImageLength", "ThumbnailImageLength");
        J(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void a() {
        String strB = b("DateTimeOriginal");
        if (strB != null && b("DateTime") == null) {
            this.f44338f[0].put("DateTime", c.a(strB));
        }
        if (b("ImageWidth") == null) {
            this.f44338f[0].put("ImageWidth", c.b(0L, this.f44340h));
        }
        if (b("ImageLength") == null) {
            this.f44338f[0].put("ImageLength", c.b(0L, this.f44340h));
        }
        if (b("Orientation") == null) {
            this.f44338f[0].put("Orientation", c.b(0L, this.f44340h));
        }
        if (b("LightSource") == null) {
            this.f44338f[1].put("LightSource", c.b(0L, this.f44340h));
        }
    }

    private c d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f44326u) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f44314i0.length; i10++) {
            c cVar = (c) this.f44338f[i10].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    private void e(f fVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                p061g0.b.C0428b.a(mediaMetadataRetriever, new C0427a(fVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f44338f[0].put("ImageWidth", c.f(Integer.parseInt(strExtractMetadata), this.f44340h));
                }
                if (strExtractMetadata2 != null) {
                    this.f44338f[0].put("ImageLength", c.f(Integer.parseInt(strExtractMetadata2), this.f44340h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    this.f44338f[0].put("Orientation", c.f(i10, this.f44340h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    fVar.v(i12);
                    byte[] bArr = new byte[6];
                    fVar.readFully(bArr);
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f44321p0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    fVar.readFully(bArr2);
                    this.f44348p = i14;
                    H(bArr2, 0);
                }
                if (f44326u) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void f(g0.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p061g0.a.f(g0.a$b, int, int):void");
    }

    private int g(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (u(bArr)) {
            return 4;
        }
        if (x(bArr)) {
            return 9;
        }
        if (t(bArr)) {
            return 12;
        }
        if (v(bArr)) {
            return 7;
        }
        if (y(bArr)) {
            return 10;
        }
        if (w(bArr)) {
            return 13;
        }
        return C(bArr) ? 14 : 0;
    }

    private void h(f fVar) throws Throwable {
        int i10;
        int i11;
        k(fVar);
        c cVar = (c) this.f44338f[1].get("MakerNote");
        if (cVar != null) {
            f fVar2 = new f(cVar.f44364d);
            fVar2.j(this.f44340h);
            byte[] bArr = f44284E;
            byte[] bArr2 = new byte[bArr.length];
            fVar2.readFully(bArr2);
            fVar2.v(0L);
            byte[] bArr3 = f44285F;
            byte[] bArr4 = new byte[bArr3.length];
            fVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                fVar2.v(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                fVar2.v(12L);
            }
            I(fVar2, 6);
            c cVar2 = (c) this.f44338f[7].get("PreviewImageStart");
            c cVar3 = (c) this.f44338f[7].get("PreviewImageLength");
            if (cVar2 != null && cVar3 != null) {
                this.f44338f[5].put("JPEGInterchangeFormat", cVar2);
                this.f44338f[5].put("JPEGInterchangeFormatLength", cVar3);
            }
            c cVar4 = (c) this.f44338f[8].get("AspectFrame");
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.k(this.f44340h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                c cVarF = c.f(i14, this.f44340h);
                c cVarF2 = c.f(i15, this.f44340h);
                this.f44338f[0].put("ImageWidth", cVarF);
                this.f44338f[0].put("ImageLength", cVarF2);
            }
        }
    }

    private void i(b bVar) throws Throwable {
        if (f44326u) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f44286G;
        bVar.n(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, f44288I)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f44289J)) {
                    return;
                }
                if (Arrays.equals(bArr2, f44287H)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f44348p = i11;
                        H(bArr3, 0);
                        P();
                        L(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.n(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void j(b bVar) throws Throwable {
        boolean z9 = f44326u;
        if (z9) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.n(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.n(i10 - bVar.c());
        bVar.readFully(bArr4);
        f(new b(bArr4), i10, 5);
        bVar.n(i12 - bVar.c());
        bVar.j(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z9) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f44309d0.f44365a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                c cVarF = c.f(s10, this.f44340h);
                c cVarF2 = c.f(s11, this.f44340h);
                this.f44338f[0].put("ImageLength", cVarF);
                this.f44338f[0].put("ImageWidth", cVarF2);
                if (f44326u) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.n(unsignedShort2);
        }
    }

    private void k(f fVar) throws Throwable {
        c cVar;
        E(fVar);
        I(fVar, 0);
        O(fVar, 0);
        O(fVar, 5);
        O(fVar, 4);
        P();
        if (this.f44336d != 8 || (cVar = (c) this.f44338f[1].get("MakerNote")) == null) {
            return;
        }
        f fVar2 = new f(cVar.f44364d);
        fVar2.j(this.f44340h);
        fVar2.n(6);
        I(fVar2, 9);
        c cVar2 = (c) this.f44338f[9].get("ColorSpace");
        if (cVar2 != null) {
            this.f44338f[1].put("ColorSpace", cVar2);
        }
    }

    private void m(f fVar) throws Throwable {
        if (f44326u) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + fVar);
        }
        k(fVar);
        c cVar = (c) this.f44338f[0].get("JpgFromRaw");
        if (cVar != null) {
            f(new b(cVar.f44364d), (int) cVar.f44363c, 5);
        }
        c cVar2 = (c) this.f44338f[0].get("ISO");
        c cVar3 = (c) this.f44338f[1].get("PhotographicSensitivity");
        if (cVar2 == null || cVar3 != null) {
            return;
        }
        this.f44338f[1].put("PhotographicSensitivity", cVar2);
    }

    private void n(f fVar) throws IOException {
        byte[] bArr = f44321p0;
        fVar.n(bArr.length);
        byte[] bArr2 = new byte[fVar.available()];
        fVar.readFully(bArr2);
        this.f44348p = bArr.length;
        H(bArr2, 0);
    }

    private void o(b bVar) throws Throwable {
        if (f44326u) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.j(ByteOrder.LITTLE_ENDIAN);
        bVar.n(f44290K.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = f44291L;
        bVar.n(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f44292M, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    bVar.readFully(bArr3);
                    this.f44348p = i12;
                    H(bArr3, 0);
                    L(new b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.n(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private void p(b bVar, HashMap map) throws Throwable {
        c cVar = (c) map.get("JPEGInterchangeFormat");
        c cVar2 = (c) map.get("JPEGInterchangeFormatLength");
        if (cVar == null || cVar2 == null) {
            return;
        }
        int i10 = cVar.i(this.f44340h);
        int i11 = cVar2.i(this.f44340h);
        if (this.f44336d == 7) {
            i10 += this.f44349q;
        }
        if (i10 > 0 && i11 > 0) {
            this.f44341i = true;
            if (this.f44333a == null && this.f44335c == null && this.f44334b == null) {
                byte[] bArr = new byte[i11];
                bVar.n(i10);
                bVar.readFully(bArr);
                this.f44346n = bArr;
            }
            this.f44344l = i10;
            this.f44345m = i11;
        }
        if (f44326u) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i10 + ", length: " + i11);
        }
    }

    private void q(b bVar, HashMap map) throws IOException {
        int i10;
        c cVar = (c) map.get("StripOffsets");
        c cVar2 = (c) map.get("StripByteCounts");
        if (cVar == null || cVar2 == null) {
            return;
        }
        long[] jArrA = p061g0.b.a(cVar.k(this.f44340h));
        long[] jArrA2 = p061g0.b.a(cVar2.k(this.f44340h));
        if (jArrA == null || jArrA.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrA2 == null || jArrA2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrA.length != jArrA2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrA2) {
            j10 += j11;
        }
        int i11 = (int) j10;
        byte[] bArr = new byte[i11];
        int i12 = 1;
        this.f44343k = true;
        this.f44342j = true;
        this.f44341i = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < jArrA.length) {
            int i16 = (int) jArrA[i13];
            int i17 = (int) jArrA2[i13];
            if (i13 < jArrA.length - i12) {
                i10 = i13;
                if (i16 + i17 != jArrA[i10 + 1]) {
                    this.f44343k = false;
                }
            } else {
                i10 = i13;
            }
            int i18 = i16 - i14;
            if (i18 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.n(i18);
                int i19 = i14 + i18;
                byte[] bArr2 = new byte[i17];
                try {
                    bVar.readFully(bArr2);
                    i14 = i19 + i17;
                    System.arraycopy(bArr2, 0, bArr, i15, i17);
                    i15 += i17;
                    i13 = i10 + 1;
                    i12 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i17 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i18 + " bytes.");
                return;
            }
        }
        this.f44346n = bArr;
        if (this.f44343k) {
            this.f44344l = (int) jArrA[0];
            this.f44345m = i11;
        }
    }

    private static boolean r(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f44321p0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f44321p0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean t(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.readFully(bArr2);
                    if (!Arrays.equals(bArr2, f44281B)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z9 = false;
                    boolean z10 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        try {
                            bVar2.readFully(bArr3);
                            if (j12 != 1) {
                                if (Arrays.equals(bArr3, f44282C)) {
                                    z9 = true;
                                } else if (Arrays.equals(bArr3, f44283D)) {
                                    z10 = true;
                                }
                                if (z9 && z10) {
                                    bVar2.close();
                                    return true;
                                }
                            }
                        } catch (EOFException unused) {
                            bVar2.close();
                            return false;
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f44326u) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean u(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f44280A;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean v(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderG = G(bVar2);
                this.f44340h = byteOrderG;
                bVar2.j(byteOrderG);
                short s10 = bVar2.readShort();
                boolean z9 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z9;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean w(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f44286G;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean x(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    private boolean y(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderG = G(bVar2);
                this.f44340h = byteOrderG;
                bVar2.j(byteOrderG);
                boolean z9 = bVar2.readShort() == 85;
                bVar2.close();
                return z9;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean z(FileDescriptor fileDescriptor) {
        try {
            g0.b.a.a(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f44326u) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            if (!f44318m0.contains(str)) {
                return cVarD.j(this.f44340h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = cVarD.f44361a;
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + cVarD.f44361a);
                    return null;
                }
                e[] eVarArr = (e[]) cVarD.k(this.f44340h);
                if (eVarArr == null || eVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(eVarArr));
                    return null;
                }
                e eVar = eVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (eVar.f44369a / eVar.f44370b));
                e eVar2 = eVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (eVar2.f44369a / eVar2.f44370b));
                e eVar3 = eVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eVar3.f44369a / eVar3.f44370b)));
            }
            try {
                return Double.toString(cVarD.h(this.f44340h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int c(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        c cVarD = d(str);
        if (cVarD != null) {
            try {
                return cVarD.i(this.f44340h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public int l() {
        switch (c("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public boolean s() {
        int iC = c("Orientation", 1);
        return iC == 2 || iC == 7 || iC == 4 || iC == 5;
    }

    private static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final DataInputStream f44356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f44357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ByteOrder f44358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f44359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f44360e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f44360e = bArr.length;
        }

        public int a() {
            return this.f44360e;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f44356a.available();
        }

        public int c() {
            return this.f44357b;
        }

        public long h() {
            return ((long) readInt()) & 4294967295L;
        }

        public void j(ByteOrder byteOrder) {
            this.f44358c = byteOrder;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public void n(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f44356a.skip(i12);
                if (iSkip <= 0) {
                    if (this.f44359d == null) {
                        this.f44359d = new byte[8192];
                    }
                    iSkip = this.f44356a.read(this.f44359d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f44357b += i11;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f44357b++;
            return this.f44356a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f44357b++;
            return this.f44356a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f44357b++;
            int i10 = this.f44356a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f44357b += 2;
            return this.f44356a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f44357b += i11;
            this.f44356a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f44357b += 4;
            int i10 = this.f44356a.read();
            int i11 = this.f44356a.read();
            int i12 = this.f44356a.read();
            int i13 = this.f44356a.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f44358c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f44358c);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f44357b += 8;
            int i10 = this.f44356a.read();
            int i11 = this.f44356a.read();
            int i12 = this.f44356a.read();
            int i13 = this.f44356a.read();
            int i14 = this.f44356a.read();
            int i15 = this.f44356a.read();
            int i16 = this.f44356a.read();
            int i17 = this.f44356a.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f44358c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f44358c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f44357b += 2;
            int i10 = this.f44356a.read();
            int i11 = this.f44356a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f44358c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f44358c);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f44357b += 2;
            return this.f44356a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f44357b++;
            return this.f44356a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f44357b += 2;
            int i10 = this.f44356a.read();
            int i11 = this.f44356a.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f44358c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f44358c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f44356a.read(bArr, i10, i11);
            this.f44357b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f44357b += bArr.length;
            this.f44356a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f44356a = dataInputStream;
            dataInputStream.mark(0);
            this.f44357b = 0;
            this.f44358c = byteOrder;
            this.f44360e = inputStream instanceof b ? ((b) inputStream).a() : -1;
        }
    }

    private static class f extends b {
        f(byte[] bArr) {
            super(bArr);
            this.f44356a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }

        public void v(long j10) throws IOException {
            int i10 = this.f44357b;
            if (i10 > j10) {
                this.f44357b = 0;
                this.f44356a.reset();
            } else {
                j10 -= (long) i10;
            }
            n((int) j10);
        }

        f(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f44356a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public a(InputStream inputStream, int i10) {
        d[][] dVarArr = f44314i0;
        this.f44338f = new HashMap[dVarArr.length];
        this.f44339g = new HashSet(dVarArr.length);
        this.f44340h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f44333a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f44321p0.length);
            if (!r(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f44337e = true;
            this.f44335c = null;
            this.f44334b = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f44335c = (AssetManager.AssetInputStream) inputStream;
            this.f44334b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (z(fileInputStream.getFD())) {
                this.f44335c = null;
                this.f44334b = fileInputStream.getFD();
            } else {
                this.f44335c = null;
                this.f44334b = null;
            }
        } else {
            this.f44335c = null;
            this.f44334b = null;
        }
        D(inputStream);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f44368d;

        d(String str, int i10, int i11) {
            this.f44366b = str;
            this.f44365a = i10;
            this.f44367c = i11;
            this.f44368d = -1;
        }

        boolean a(int i10) {
            int i11;
            int i12 = this.f44367c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f44368d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        d(String str, int i10, int i11, int i12) {
            this.f44366b = str;
            this.f44365a = i10;
            this.f44367c = i11;
            this.f44368d = i12;
        }
    }

    /* JADX INFO: renamed from: g0.a$a, reason: collision with other inner class name */
    class C0427a extends MediaDataSource {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f44353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f44354b;

        C0427a(f fVar) {
            this.f44354b = fVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f44353a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f44354b.available())) {
                        return -1;
                    }
                    this.f44354b.v(j10);
                    this.f44353a = j10;
                }
                if (i11 > this.f44354b.available()) {
                    i11 = this.f44354b.available();
                }
                int i12 = this.f44354b.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f44353a += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f44353a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
