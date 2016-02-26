<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin - Bootstrap Admin Template</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/sb-admin.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="dashboard.jsp">FX LMS Dashboard</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu message-dropdown">
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>John Smith</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-footer"><a href="#">Read All New
								Messages</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-bell"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu alert-dropdown">
						<li><a href="#">Alert Name <span
								class="label label-default">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-primary">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-success">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span class="label label-info">Alert
									Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-warning">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-danger">Alert Badge</span></a></li>
						<li class="divider"></li>
						<li><a href="#">View All</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i>
						${sessionScope.Username } <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>
						<li><a href="#"><i class="fa fa-fw fa-envelope"></i>
								Inbox</a></li>
						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="logout"><i class="fa fa-fw fa-power-off"></i>
								Log Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li><a href="welcome"><i class="fa fa-home"></i> Dashboard</a>
					</li>
					<li><a href="course"><i class="fa fa-book"></i> My Courses</a>
					</li>
					<li class="active"><a href="javascript:;"
						data-toggle="collapse" data-target="#demo"><i
							class="fa fa-graduation-cap"></i> Students <i
							class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="#">Add New Student</a></li>
							<li><a href="student">Manage Students</a></li>
						</ul></li>
					<li><a href="lecturer"><i class="fa fa-fw fa-table"></i>
							Lecturers</a></li>
					<li><a href="enroll"><i class="fa fa-fw fa-table"></i>
							Enrollments</a></li>
					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i>
							Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="#">Dropdown Item</a></li>
							<li><a href="#">Dropdown Item</a></li>
						</ul></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>

		<div id="page-wrapper">

			<div class="container-fluid">

				<!-- Page Heading -->
				<div class="row">
					<div class="col-lg-12">
						<h3>Student Details</h3>
						<ol class="breadcrumb">
							<li><i class="fa fa-dashboard"></i> <a href="index.html">Dashboard</a>
							</li>
							<li class="active"><i class="fa fa-file"></i> Student
								Details Page</li>
						</ol>
					</div>
				</div>
				<!-- /.row -->
				<div class="row">
					<div class="col-lg-12">
						 <div class="panel panel-info" style="padding:3%;"> 

						<!-- <div class="panel-content"> -->
						<!-- <div class="row"> -->

							<form role="form" action="createStudent" method="post">
								<div class="row">
									<div class="col-lg-2">								
											<h5>E-mail Address:</h5>																					
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter E-mail" name="email">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-2">
											<h5>Select Country:</h5>																					
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<select class="form-control" id="countryid"
												style="width: 100%;" name="country">
												<option value="0">-- Select Country --</option>
												<option value="3">Afghanistan</option>
												<option value="15">Åland</option>
												<option value="6">Albania</option>
												<option value="62">Algeria</option>
												<option value="11">American Samoa</option>
												<option value="1">Andorra</option>
												<option value="8">Angola</option>
												<option value="5">Anguilla</option>
												<option value="9">Antarctica</option>
												<option value="4">Antigua and Barbuda</option>
												<option value="10">Argentina</option>
												<option value="7">Armenia</option>
												<option value="14">Aruba</option>
												<option value="13">Australia</option>
												<option value="12">Austria</option>
												<option value="16">Azerbaijan</option>
												<option value="32">Bahamas</option>
												<option value="23">Bahrain</option>
												<option value="19">Bangladesh</option>
												<option value="18">Barbados</option>
												<option value="36">Belarus</option>
												<option value="20">Belgium</option>
												<option value="37">Belize</option>
												<option value="25">Benin</option>
												<option value="27">Bermuda</option>
												<option value="33">Bhutan</option>
												<option value="29">Bolivia</option>
												<option value="30">Bonaire</option>
												<option value="17">Bosnia and Herzegovina</option>
												<option value="35">Botswana</option>
												<option value="34">Bouvet Island</option>
												<option value="31">Brazil</option>
												<option value="106">British Indian Ocean Territory</option>
												<option value="239">British Virgin Islands</option>
												<option value="28">Brunei</option>
												<option value="22">Bulgaria</option>
												<option value="21">Burkina Faso</option>
												<option value="24">Burundi</option>
												<option value="117">Cambodia</option>
												<option value="47">Cameroon</option>
												<option value="38">Canada</option>
												<option value="52">Cape Verde</option>
												<option value="124">Cayman Islands</option>
												<option value="41">Central African Republic</option>
												<option value="215">Chad</option>
												<option value="46">Chile</option>
												<option value="48">China</option>
												<option value="54">Christmas Island</option>
												<option value="39">Cocos [Keeling] Islands</option>
												<option value="49">Colombia</option>
												<option value="119">Comoros</option>
												<option value="45">Cook Islands</option>
												<option value="50">Costa Rica</option>
												<option value="98">Croatia</option>
												<option value="51">Cuba</option>
												<option value="53">Curacao</option>
												<option value="55">Cyprus</option>
												<option value="56">Czech Republic</option>
												<option value="40">Democratic Republic of the Congo</option>
												<option value="59">Denmark</option>
												<option value="58">Djibouti</option>
												<option value="60">Dominica</option>
												<option value="61">Dominican Republic</option>
												<option value="221">East Timor</option>
												<option value="63">Ecuador</option>
												<option value="65">Egypt</option>
												<option value="210">El Salvador</option>
												<option value="88">Equatorial Guinea</option>
												<option value="67">Eritrea</option>
												<option value="64">Estonia</option>
												<option value="69">Ethiopia</option>
												<option value="72">Falkland Islands</option>
												<option value="74">Faroe Islands</option>
												<option value="71">Fiji</option>
												<option value="70">Finland</option>
												<option value="75">France</option>
												<option value="80">French Guiana</option>
												<option value="175">French Polynesia</option>
												<option value="216">French Southern Territories</option>
												<option value="76">Gabon</option>
												<option value="85">Gambia</option>
												<option value="79">Georgia</option>
												<option value="57">Germany</option>
												<option value="82">Ghana</option>
												<option value="83">Gibraltar</option>
												<option value="89">Greece</option>
												<option value="84">Greenland</option>
												<option value="78">Grenada</option>
												<option value="87">Guadeloupe</option>
												<option value="92">Guam</option>
												<option value="91">Guatemala</option>
												<option value="81">Guernsey</option>
												<option value="86">Guinea</option>
												<option value="93">Guinea-Bissau</option>
												<option value="94">Guyana</option>
												<option value="99">Haiti</option>
												<option value="96">Heard Island and McDonald
													Islands</option>
												<option value="97">Honduras</option>
												<option value="95">Hong Kong</option>
												<option value="100">Hungary</option>
												<option value="109">Iceland</option>
												<option value="105">India</option>
												<option value="101">Indonesia</option>
												<option value="108">Iran</option>
												<option value="107">Iraq</option>
												<option value="102">Ireland</option>
												<option value="104">Isle of Man</option>
												<option value="103">Israel</option>
												<option value="110">Italy</option>
												<option value="44">Ivory Coast</option>
												<option value="112">Jamaica</option>
												<option value="114">Japan</option>
												<option value="111">Jersey</option>
												<option value="113">Jordan</option>
												<option value="125">Kazakhstan</option>
												<option value="115">Kenya</option>
												<option value="118">Kiribati</option>
												<option value="245">Kosovo</option>
												<option value="123">Kuwait</option>
												<option value="116">Kyrgyzstan</option>
												<option value="126">Laos</option>
												<option value="135">Latvia</option>
												<option value="127">Lebanon</option>
												<option value="132">Lesotho</option>
												<option value="131">Liberia</option>
												<option value="136">Libya</option>
												<option value="129">Liechtenstein</option>
												<option value="133">Lithuania</option>
												<option value="134">Luxembourg</option>
												<option value="148">Macao</option>
												<option value="144">Macedonia</option>
												<option value="142">Madagascar</option>
												<option value="156">Malawi</option>
												<option value="158">Malaysia</option>
												<option value="155">Maldives</option>
												<option value="145">Mali</option>
												<option value="153">Malta</option>
												<option value="143">Marshall Islands</option>
												<option value="150">Martinique</option>
												<option value="151">Mauritania</option>
												<option value="154">Mauritius</option>
												<option value="247">Mayotte</option>
												<option value="157">Mexico</option>
												<option value="73">Micronesia</option>
												<option value="139">Moldova</option>
												<option value="138">Monaco</option>
												<option value="147">Mongolia</option>
												<option value="140">Montenegro</option>
												<option value="152">Montserrat</option>
												<option value="137">Morocco</option>
												<option value="159">Mozambique</option>
												<option value="146">Myanmar [Burma]</option>
												<option value="160">Namibia</option>
												<option value="169">Nauru</option>
												<option value="168">Nepal</option>
												<option value="166">Netherlands</option>
												<option value="161">New Caledonia</option>
												<option value="171">New Zealand</option>
												<option value="165">Nicaragua</option>
												<option value="162">Niger</option>
												<option value="164">Nigeria</option>
												<option value="170">Niue</option>
												<option value="163">Norfolk Island</option>
												<option value="121">North Korea</option>
												<option value="149">Northern Mariana Islands</option>
												<option value="167">Norway</option>
												<option value="172">Oman</option>
												<option value="178">Pakistan</option>
												<option value="185">Palau</option>
												<option value="183">Palestine</option>
												<option value="173">Panama</option>
												<option value="176">Papua New Guinea</option>
												<option value="186">Paraguay</option>
												<option value="174">Peru</option>
												<option value="177">Philippines</option>
												<option value="181">Pitcairn Islands</option>
												<option value="179">Poland</option>
												<option value="184">Portugal</option>
												<option value="182">Puerto Rico</option>
												<option value="187">Qatar</option>
												<option value="42">Republic of the Congo</option>
												<option value="188">Réunion</option>
												<option value="189">Romania</option>
												<option value="191">Russia</option>
												<option value="192">Rwanda</option>
												<option value="26">Saint Barthélemy</option>
												<option value="199">Saint Helena</option>
												<option value="120">Saint Kitts and Nevis</option>
												<option value="128">Saint Lucia</option>
												<option value="141">Saint Martin</option>
												<option value="180">Saint Pierre and Miquelon</option>
												<option value="237">Saint Vincent and the
													Grenadines</option>
												<option value="244">Samoa</option>
												<option value="204">San Marino</option>
												<option value="209">São Tomé and Príncipe</option>
												<option value="193">Saudi Arabia</option>
												<option value="205">Senegal</option>
												<option value="190">Serbia</option>
												<option value="195">Seychelles</option>
												<option value="203">Sierra Leone</option>
												<option value="198">Singapore</option>
												<option value="211">Sint Maarten</option>
												<option value="202">Slovakia</option>
												<option value="200">Slovenia</option>
												<option value="194">Solomon Islands</option>
												<option value="206">Somalia</option>
												<option value="248">South Africa</option>
												<option value="90">South Georgia and the South
													Sandwich Islands</option>
												<option value="122">South Korea</option>
												<option value="208">South Sudan</option>
												<option value="68">Spain</option>
												<option value="130">Sri Lanka</option>
												<option value="196">Sudan</option>
												<option value="207">Suriname</option>
												<option value="201">Svalbard and Jan Mayen</option>
												<option value="213">Swaziland</option>
												<option value="197">Sweden</option>
												<option value="43">Switzerland</option>
												<option value="212">Syria</option>
												<option value="228">Taiwan</option>
												<option value="219">Tajikistan</option>
												<option value="229">Tanzania</option>
												<option value="218">Thailand</option>
												<option value="217">Togo</option>
												<option value="220">Tokelau</option>
												<option value="224">Tonga</option>
												<option value="226">Trinidad and Tobago</option>
												<option value="223">Tunisia</option>
												<option value="225">Turkey</option>
												<option value="222">Turkmenistan</option>
												<option value="214">Turks and Caicos Islands</option>
												<option value="227">Tuvalu</option>
												<option value="232">U.S. Minor Outlying Islands</option>
												<option value="240">U.S. Virgin Islands</option>
												<option value="231">Uganda</option>
												<option value="230">Ukraine</option>
												<option value="2">United Arab Emirates</option>
												<option value="77">United Kingdom</option>
												<option value="233">United States</option>
												<option value="234">Uruguay</option>
												<option value="235">Uzbekistan</option>
												<option value="242">Vanuatu</option>
												<option value="236">Vatican City</option>
												<option value="238">Venezuela</option>
												<option value="241">Vietnam</option>
												<option value="243">Wallis and Futuna</option>
												<option value="66">Western Sahara</option>
												<option value="246">Yemen</option>
												<option value="249">Zambia</option>
												<option value="250">Zimbabwe</option>
											</select>
										</div>
									</div>
									
								</div>
								<div class="row">
									<div class="col-lg-2">
											<h5>Title :</h5>																					
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<select class="form-control" id="prefix"
												style="width: 100%;" name="title">
												<option value="Mr">Mr</option>
												<option value="Mrs">Mrs</option>
												<option value="Miss">Miss</option>
												<option value="Dr">Dr</option>
												<option value="Rev">Rev</option>
											</select>
											
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-2">
											<h5>Student Name:</h5>																					
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter First Name" name="f_Name">
										</div>
									</div>
									
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Last Name" name="l_Name">
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="col-lg-2">
											<h5>Address :</h5>																					
									</div>
									
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Address line 1" name="address1">
										</div>

									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Address line 2" name="address2">
										</div>
									</div>
									
								</div>
								<div class="row">

									<div class="col-lg-2">
											<h5>State :</h5>																					
									</div>								
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter State" name="state">
										</div>
									</div>
								</div>
								
								<div class="row">
									<div class="col-lg-2">
											<h5>Postal code :</h5>																					
									</div>	
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Postal code" name="zipcode">
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col-lg-2">
											<h5>Contact Details :</h5>																					
									</div>	
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Telephone number1" name="tp1">
										</div>
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Telephone number2" name="tp2">
										</div>
									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<input class="form-control" placeholder="Enter Mobile no" name="mobile">
										</div>

									</div>
									
								</div>
								<div class="row">
									<div class="col-lg-2">
										<div class="form-group">
											
										</div>

									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<button type="submit" class="btn btn-primary" style="width: 100%;">Create New Student</button>
										</div>

									</div>
									<div class="col-lg-3">
										<div class="form-group">
											<button type="reset" class="btn btn-warning" style="width: 100%;">Clear Data</button>
										</div>

									</div>
									
								</div>
							</form>

						<!-- </div> -->
						<!-- /.row -->

						<!-- </div> -->
						</div> 
					</div>
				</div>
			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>