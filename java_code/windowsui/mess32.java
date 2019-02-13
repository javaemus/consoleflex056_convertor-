
/*
 * ported to v0.37b7
 * using automatic conversion tool v0.01
 */ 
package windowsui;

public class mess32
{
	
	/////////////////////////////////////////////////////////////////////////////
	//
	// Icon
	//
	
	IDI_WIN_FLOP            ICON    DISCARDABLE     "res/win_flop.ico"
	IDI_WIN_CASS            ICON    DISCARDABLE     "res/win_cass.ico"
	IDI_WIN_SERL            ICON    DISCARDABLE     "res/win_serl.ico"
	IDI_WIN_SNAP            ICON    DISCARDABLE     "res/win_snap.ico"
	IDI_WIN_PRIN            ICON    DISCARDABLE     "res/win_prin.ico"
	IDI_WIN_HARD            ICON    DISCARDABLE     "res/win_hard.ico"
	
	/////////////////////////////////////////////////////////////////////////////
	//
	// Dialog
	//
	
	IDD_PROP_SOFTWARE DIALOGEX 0, 0, 220, 205
	STYLE WS_CHILD | WS_CAPTION
	CAPTION "Software"
	FONT 8, "MS Sans Serif"
	BEGIN
	    ICON            IDI_WIN_FLOP,IDC_STATIC,20,10,20,20
	    LTEXT           "Title\nDirectory\nExtra",IDC_PROP_TITLE,52,9,161,25,
	                    SS_NOPREFIX
	    LTEXT           "Additional directories:",IDC_STATIC,7,40,157,8
	    CONTROL         "List1",IDC_DIR_LIST,"SysListView32",LVS_REPORT |
	                    LVS_SINGLESEL | LVS_SHOWSELALWAYS | LVS_EDITLABELS |
	                    LVS_ALIGNLEFT | LVS_NOCOLUMNHEADER | WS_BORDER |
	                    WS_TABSTOP,7,50,206,120
	    PUSHBUTTON      "Browse...",IDC_DIR_BROWSE,7,180,50,14
	    PUSHBUTTON      "Insert",IDC_DIR_INSERT,85,180,50,14
	    PUSHBUTTON      "Delete",IDC_DIR_DELETE,163,180,50,14
	END
	
	IDD_FILEMGR DIALOGEX 0, 0, 300, 200
	STYLE DS_MODALFRAME | WS_POPUP | WS_CAPTION
	EXSTYLE WS_EX_CONTROLPARENT
	CAPTION "File Manager"
	FONT 8, "MS Sans Serif"
	BEGIN
	    CONTROL         "List2",IDC_LIST2,"SysListView32",LVS_REPORT | LVS_SINGLESEL |
	                    LVS_SHOWSELALWAYS | LVS_OWNERDRAWFIXED | LVS_SHAREIMAGELISTS |
						WS_BORDER |	WS_TABSTOP,10,10,280,180
	END
	
	/////////////////////////////////////////////////////////////////////////////
	
	
}
