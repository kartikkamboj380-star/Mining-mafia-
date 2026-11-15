package androidx.appcompat.app;

import O.AbstractC0845c0;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.T;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import p060g.f;
import p060g.j;
import p070h.q;

/* JADX INFO: loaded from: classes.dex */
class AlertController {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    NestedScrollView f7440A;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private Drawable f7442C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private ImageView f7443D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private TextView f7444E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private TextView f7445F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private View f7446G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    ListAdapter f7447H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f7449J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f7450K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    int f7451L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    int f7452M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    int f7453N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    int f7454O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private boolean f7455P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    Handler f7457R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final q f7460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f7461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f7463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f7464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f7465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f7466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f7467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f7468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7470l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f7471m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f7473o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f7474p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f7475q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f7476r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f7477s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f7478t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f7479u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f7480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f7481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f7482x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f7483y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f7484z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f7472n = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f7441B = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f7448I = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f7456Q = 0;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f7458S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f7485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7486b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f44163c2);
            this.f7486b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f44168d2, -1);
            this.f7485a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f44173e2, -1);
        }

        public void a(boolean z9, boolean z10) {
            if (z10 && z9) {
                return;
            }
            setPadding(getPaddingLeft(), z9 ? getPaddingTop() : this.f7485a, getPaddingRight(), z10 ? getPaddingBottom() : this.f7486b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f7473o && (message3 = alertController.f7475q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f7477s || (message2 = alertController.f7479u) == null) {
                messageObtain = (view != alertController.f7481w || (message = alertController.f7483y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f7457R.obtainMessage(1, alertController2.f7460b).sendToTarget();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f7488A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f7489B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f7490C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f7491D;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public boolean[] f7493F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public boolean f7494G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public boolean f7495H;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f7497J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public Cursor f7498K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public String f7499L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public String f7500M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f7501N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f7504b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f7506d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f7508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f7509g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f7510h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f7511i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f7512j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f7513k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f7514l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f7515m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f7516n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f7517o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f7518p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f7519q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f7521s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f7522t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f7523u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f7524v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f7525w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f7526x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f7527y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f7528z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7505c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7507e = 0;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public boolean f7492E = false;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f7496I = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f7502O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f7520r = true;

        class a extends ArrayAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f7529a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f7529a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = b.this.f7493F;
                if (zArr != null && zArr[i10]) {
                    this.f7529a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0133b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f7531a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f7532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f7533c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f7534d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0133b(Context context, Cursor cursor, boolean z9, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z9);
                this.f7533c = recycleListView;
                this.f7534d = alertController;
                Cursor cursor2 = getCursor();
                this.f7531a = cursor2.getColumnIndexOrThrow(b.this.f7499L);
                this.f7532b = cursor2.getColumnIndexOrThrow(b.this.f7500M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f7531a));
                this.f7533c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f7532b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f7504b.inflate(this.f7534d.f7452M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f7536a;

            c(AlertController alertController) {
                this.f7536a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                b.this.f7526x.onClick(this.f7536a.f7460b, i10);
                if (b.this.f7495H) {
                    return;
                }
                this.f7536a.f7460b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f7538a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f7539b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f7538a = recycleListView;
                this.f7539b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = b.this.f7493F;
                if (zArr != null) {
                    zArr[i10] = this.f7538a.isItemChecked(i10);
                }
                b.this.f7497J.onClick(this.f7539b.f7460b, i10, this.f7538a.isItemChecked(i10));
            }
        }

        public b(Context context) {
            this.f7503a = context;
            this.f7504b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f7504b.inflate(alertController.f7451L, (ViewGroup) null);
            if (!this.f7494G) {
                bVar = this;
                alertController2 = alertController;
                int i10 = bVar.f7495H ? alertController2.f7453N : alertController2.f7454O;
                if (bVar.f7498K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f7503a, i10, bVar.f7498K, new String[]{bVar.f7499L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f7525w;
                    if (dVar == null) {
                        dVar = new d(bVar.f7503a, i10, R.id.text1, bVar.f7524v);
                    }
                }
            } else if (this.f7498K == null) {
                bVar = this;
                dVar = bVar.new a(this.f7503a, alertController.f7452M, R.id.text1, this.f7524v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0133b(bVar.f7503a, bVar.f7498K, false, recycleListView, alertController2);
            }
            alertController2.f7447H = dVar;
            alertController2.f7448I = bVar.f7496I;
            if (bVar.f7526x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.f7497J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.f7501N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.f7495H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.f7494G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f7465g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f7509g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f7508f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f7506d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i10 = this.f7505c;
                if (i10 != 0) {
                    alertController.l(i10);
                }
                int i11 = this.f7507e;
                if (i11 != 0) {
                    alertController.l(alertController.c(i11));
                }
            }
            CharSequence charSequence2 = this.f7510h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f7511i;
            if (charSequence3 == null && this.f7512j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f7513k, null, this.f7512j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f7514l;
            if (charSequence4 != null || this.f7515m != null) {
                alertController2.j(-2, charSequence4, this.f7516n, null, this.f7515m);
            }
            CharSequence charSequence5 = this.f7517o;
            if (charSequence5 != null || this.f7518p != null) {
                alertController2.j(-3, charSequence5, this.f7519q, null, this.f7518p);
            }
            if (this.f7524v != null || this.f7498K != null || this.f7525w != null) {
                b(alertController2);
            }
            View view2 = this.f7528z;
            if (view2 != null) {
                if (this.f7492E) {
                    alertController2.s(view2, this.f7488A, this.f7489B, this.f7490C, this.f7491D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i12 = this.f7527y;
            if (i12 != 0) {
                alertController2.q(i12);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference f7541a;

        public c(DialogInterface dialogInterface) {
            this.f7541a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f7541a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter {
        public d(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f7459a = context;
        this.f7460b = qVar;
        this.f7461c = window;
        this.f7457R = new c(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, j.f44053F, p060g.a.f43865k, 0);
        this.f7449J = typedArrayObtainStyledAttributes.getResourceId(j.f44058G, 0);
        this.f7450K = typedArrayObtainStyledAttributes.getResourceId(j.f44068I, 0);
        this.f7451L = typedArrayObtainStyledAttributes.getResourceId(j.f44078K, 0);
        this.f7452M = typedArrayObtainStyledAttributes.getResourceId(j.f44083L, 0);
        this.f7453N = typedArrayObtainStyledAttributes.getResourceId(j.f44093N, 0);
        this.f7454O = typedArrayObtainStyledAttributes.getResourceId(j.f44073J, 0);
        this.f7455P = typedArrayObtainStyledAttributes.getBoolean(j.f44088M, true);
        this.f7462d = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f44063H, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.k(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i10 = this.f7450K;
        if (i10 == 0) {
            return this.f7449J;
        }
        return this.f7456Q == 1 ? i10 : this.f7449J;
    }

    private void o(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f7461c.findViewById(f.f43985v);
        View viewFindViewById2 = this.f7461c.findViewById(f.f43984u);
        AbstractC0845c0.E0(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f7473o = button;
        button.setOnClickListener(this.f7458S);
        if (TextUtils.isEmpty(this.f7474p) && this.f7476r == null) {
            this.f7473o.setVisibility(8);
            i10 = 0;
        } else {
            this.f7473o.setText(this.f7474p);
            Drawable drawable = this.f7476r;
            if (drawable != null) {
                int i11 = this.f7462d;
                drawable.setBounds(0, 0, i11, i11);
                this.f7473o.setCompoundDrawables(this.f7476r, null, null, null);
            }
            this.f7473o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f7477s = button2;
        button2.setOnClickListener(this.f7458S);
        if (TextUtils.isEmpty(this.f7478t) && this.f7480v == null) {
            this.f7477s.setVisibility(8);
        } else {
            this.f7477s.setText(this.f7478t);
            Drawable drawable2 = this.f7480v;
            if (drawable2 != null) {
                int i12 = this.f7462d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f7477s.setCompoundDrawables(this.f7480v, null, null, null);
            }
            this.f7477s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f7481w = button3;
        button3.setOnClickListener(this.f7458S);
        if (TextUtils.isEmpty(this.f7482x) && this.f7484z == null) {
            this.f7481w.setVisibility(8);
        } else {
            this.f7481w.setText(this.f7482x);
            Drawable drawable3 = this.f7484z;
            if (drawable3 != null) {
                int i13 = this.f7462d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f7481w.setCompoundDrawables(this.f7484z, null, null, null);
            }
            this.f7481w.setVisibility(0);
            i10 |= 4;
        }
        if (y(this.f7459a)) {
            if (i10 == 1) {
                b(this.f7473o);
            } else if (i10 == 2) {
                b(this.f7477s);
            } else if (i10 == 4) {
                b(this.f7481w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f7461c.findViewById(f.f43986w);
        this.f7440A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f7440A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f7445F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f7464f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f7440A.removeView(this.f7445F);
        if (this.f7465g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f7440A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.f7440A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f7465g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f7466h;
        if (viewInflate == null) {
            viewInflate = this.f7467i != 0 ? LayoutInflater.from(this.f7459a).inflate(this.f7467i, viewGroup, false) : null;
        }
        boolean z9 = viewInflate != null;
        if (!z9 || !a(viewInflate)) {
            this.f7461c.setFlags(131072, 131072);
        }
        if (!z9) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f7461c.findViewById(f.f43977n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f7472n) {
            frameLayout.setPadding(this.f7468j, this.f7469k, this.f7470l, this.f7471m);
        }
        if (this.f7465g != null) {
            ((LinearLayout.LayoutParams) ((T.a) viewGroup.getLayoutParams())).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.f7446G != null) {
            viewGroup.addView(this.f7446G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f7461c.findViewById(f.f43962O).setVisibility(8);
            return;
        }
        this.f7443D = (ImageView) this.f7461c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f7463e) || !this.f7455P) {
            this.f7461c.findViewById(f.f43962O).setVisibility(8);
            this.f7443D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f7461c.findViewById(f.f43973j);
        this.f7444E = textView;
        textView.setText(this.f7463e);
        int i10 = this.f7441B;
        if (i10 != 0) {
            this.f7443D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.f7442C;
        if (drawable != null) {
            this.f7443D.setImageDrawable(drawable);
        } else {
            this.f7444E.setPadding(this.f7443D.getPaddingLeft(), this.f7443D.getPaddingTop(), this.f7443D.getPaddingRight(), this.f7443D.getPaddingBottom());
            this.f7443D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f7461c.findViewById(f.f43983t);
        View viewFindViewById4 = viewFindViewById3.findViewById(f.f43963P);
        View viewFindViewById5 = viewFindViewById3.findViewById(f.f43976m);
        View viewFindViewById6 = viewFindViewById3.findViewById(f.f43974k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(f.f43978o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(f.f43963P);
        View viewFindViewById8 = viewGroup.findViewById(f.f43976m);
        View viewFindViewById9 = viewGroup.findViewById(f.f43974k);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z9 = viewGroup.getVisibility() != 8;
        boolean z10 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z11 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z11 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(f.f43958K)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z10 != 0) {
            NestedScrollView nestedScrollView = this.f7440A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f7464f == null && this.f7465g == null) ? null : viewGroupH.findViewById(f.f43961N);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(f.f43959L)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f7465g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z10, z11);
        }
        if (!z9) {
            View view = this.f7465g;
            if (view == null) {
                view = this.f7440A;
            }
            if (view != null) {
                o(viewGroupH2, view, z10 | (z11 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f7465g;
        if (listView2 == null || (listAdapter = this.f7447H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.f7448I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p060g.a.f43864j, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f7459a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f7465g;
    }

    public void e() {
        this.f7460b.setContentView(i());
        x();
    }

    public boolean f(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7440A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f7440A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f7457R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f7482x = charSequence;
            this.f7483y = message;
            this.f7484z = drawable;
        } else if (i10 == -2) {
            this.f7478t = charSequence;
            this.f7479u = message;
            this.f7480v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f7474p = charSequence;
            this.f7475q = message;
            this.f7476r = drawable;
        }
    }

    public void k(View view) {
        this.f7446G = view;
    }

    public void l(int i10) {
        this.f7442C = null;
        this.f7441B = i10;
        ImageView imageView = this.f7443D;
        if (imageView != null) {
            if (i10 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f7443D.setImageResource(this.f7441B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.f7442C = drawable;
        this.f7441B = 0;
        ImageView imageView = this.f7443D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f7443D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f7464f = charSequence;
        TextView textView = this.f7445F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f7463e = charSequence;
        TextView textView = this.f7444E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i10) {
        this.f7466h = null;
        this.f7467i = i10;
        this.f7472n = false;
    }

    public void r(View view) {
        this.f7466h = view;
        this.f7467i = 0;
        this.f7472n = false;
    }

    public void s(View view, int i10, int i11, int i12, int i13) {
        this.f7466h = view;
        this.f7467i = 0;
        this.f7472n = true;
        this.f7468j = i10;
        this.f7469k = i11;
        this.f7470l = i12;
        this.f7471m = i13;
    }
}
