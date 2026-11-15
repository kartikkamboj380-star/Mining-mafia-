package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class b0 extends S.c implements View.OnClickListener {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final int f8185G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f8186H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f8187I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ColorStateList f8188J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f8189K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private int f8190L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f8191M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f8192N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f8193O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f8194P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final SearchView f8195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchableInfo f8196m;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Context f8197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final WeakHashMap f8198w;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f8199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f8200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f8201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f8202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f8203e;

        public a(View view) {
            this.f8199a = (TextView) view.findViewById(R.id.text1);
            this.f8200b = (TextView) view.findViewById(R.id.text2);
            this.f8201c = (ImageView) view.findViewById(R.id.icon1);
            this.f8202d = (ImageView) view.findViewById(R.id.icon2);
            this.f8203e = (ImageView) view.findViewById(p060g.f.f43980q);
        }
    }

    public b0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f8186H = false;
        this.f8187I = 1;
        this.f8189K = -1;
        this.f8190L = -1;
        this.f8191M = -1;
        this.f8192N = -1;
        this.f8193O = -1;
        this.f8194P = -1;
        this.f8195l = searchView;
        this.f8196m = searchableInfo;
        this.f8185G = searchView.getSuggestionCommitIconResId();
        this.f8197v = context;
        this.f8198w = weakHashMap;
    }

    private void B(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void C(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void D(String str, Drawable drawable) {
        if (drawable != null) {
            this.f8198w.put(str, drawable.getConstantState());
        }
    }

    private void E(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable n(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8198w.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence o(CharSequence charSequence) {
        if (this.f8188J == null) {
            TypedValue typedValue = new TypedValue();
            this.f8197v.getTheme().resolveAttribute(p060g.a.f43852K, typedValue, true);
            this.f8188J = this.f8197v.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f8188J, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable p(ComponentName componentName) {
        PackageManager packageManager = this.f8197v.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("SuggestionsAdapter", e10.toString());
            return null;
        }
    }

    private Drawable q(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f8198w.containsKey(strFlattenToShortString)) {
            Drawable drawableP = p(componentName);
            this.f8198w.put(strFlattenToShortString, drawableP != null ? drawableP.getConstantState() : null);
            return drawableP;
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f8198w.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f8197v.getResources());
    }

    public static String r(Cursor cursor, String str) {
        return z(cursor, cursor.getColumnIndex(str));
    }

    private Drawable s() {
        Drawable drawableQ = q(this.f8196m.getSearchActivity());
        return drawableQ != null ? drawableQ : this.f8197v.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable t(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return u(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f8197v.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e10) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e11) {
                    Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                }
                throw th;
            }
        } catch (FileNotFoundException e12) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
            return null;
        }
        Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
        return null;
    }

    private Drawable v(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f8197v.getPackageName() + "/" + i10;
            Drawable drawableN = n(str2);
            if (drawableN != null) {
                return drawableN;
            }
            Drawable drawableE = C.b.e(this.f8197v, i10);
            D(str2, drawableE);
            return drawableE;
        } catch (Resources.NotFoundException unused) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableN2 = n(str);
            if (drawableN2 != null) {
                return drawableN2;
            }
            Drawable drawableT = t(Uri.parse(str));
            D(str, drawableT);
            return drawableT;
        }
    }

    private Drawable w(Cursor cursor) {
        int i10 = this.f8192N;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableV = v(cursor.getString(i10));
        return drawableV != null ? drawableV : s();
    }

    private Drawable x(Cursor cursor) {
        int i10 = this.f8193O;
        if (i10 == -1) {
            return null;
        }
        return v(cursor.getString(i10));
    }

    private static String z(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    public void A(int i10) {
        this.f8187I = i10;
    }

    @Override // S.a, S.b.a
    public void b(Cursor cursor) {
        if (this.f8186H) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f8189K = cursor.getColumnIndex("suggest_text_1");
                this.f8190L = cursor.getColumnIndex("suggest_text_2");
                this.f8191M = cursor.getColumnIndex("suggest_text_2_url");
                this.f8192N = cursor.getColumnIndex("suggest_icon_1");
                this.f8193O = cursor.getColumnIndex("suggest_icon_2");
                this.f8194P = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // S.a, S.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strR;
        String strR2;
        if (cursor == null) {
            return null;
        }
        String strR3 = r(cursor, "suggest_intent_query");
        if (strR3 != null) {
            return strR3;
        }
        if (this.f8196m.shouldRewriteQueryFromData() && (strR2 = r(cursor, "suggest_intent_data")) != null) {
            return strR2;
        }
        if (!this.f8196m.shouldRewriteQueryFromText() || (strR = r(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strR;
    }

    @Override // S.b.a
    public Cursor e(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f8195l.getVisibility() == 0 && this.f8195l.getWindowVisibility() == 0) {
            try {
                Cursor cursorY = y(this.f8196m, string, 50);
                if (cursorY != null) {
                    cursorY.getCount();
                    return cursorY;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // S.a
    public void g(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f8194P;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f8199a != null) {
            C(aVar.f8199a, z(cursor, this.f8189K));
        }
        if (aVar.f8200b != null) {
            String strZ = z(cursor, this.f8191M);
            CharSequence charSequenceO = strZ != null ? o(strZ) : z(cursor, this.f8190L);
            if (TextUtils.isEmpty(charSequenceO)) {
                TextView textView = aVar.f8199a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f8199a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f8199a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f8199a.setMaxLines(1);
                }
            }
            C(aVar.f8200b, charSequenceO);
        }
        ImageView imageView = aVar.f8201c;
        if (imageView != null) {
            B(imageView, w(cursor), 4);
        }
        ImageView imageView2 = aVar.f8202d;
        if (imageView2 != null) {
            B(imageView2, x(cursor), 8);
        }
        int i12 = this.f8187I;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f8203e.setVisibility(8);
            return;
        }
        aVar.f8203e.setVisibility(0);
        aVar.f8203e.setTag(aVar.f8199a.getText());
        aVar.f8203e.setOnClickListener(this);
    }

    @Override // S.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewJ = j(this.f8197v, f(), viewGroup);
            if (viewJ != null) {
                ((a) viewJ.getTag()).f8199a.setText(e10.toString());
            }
            return viewJ;
        }
    }

    @Override // S.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewK = k(this.f8197v, f(), viewGroup);
            if (viewK != null) {
                ((a) viewK.getTag()).f8199a.setText(e10.toString());
            }
            return viewK;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // S.c, S.a
    public View k(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewK = super.k(context, cursor, viewGroup);
        viewK.setTag(new a(viewK));
        ((ImageView) viewK.findViewById(p060g.f.f43980q)).setImageResource(this.f8185G);
        return viewK;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        E(f());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        E(f());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f8195l.S((CharSequence) tag);
        }
    }

    Drawable u(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f8197v.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor y(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f8197v.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }
}
