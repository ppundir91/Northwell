<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
   "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
   <head>
      <title>Patient Search</title>
   </head>
   <body>
		<form action="getSDA" method="post">
			<table>
		   		<tr>
		   			<td>
		   				<label for="MRN">MRN</label>
		   			</td>
		   			<td>
						<input type = "text" name="MRN"/>
					</td>
				</tr>	
				<tr>
					<td>
		   				<label for="AssigningAuthority">Assigned By</label>
		   			</td>
		   			<td>
						<select name="AssigningAuthority">
							<option value="CEMS">CEMS</option>
							<option value="CLAB">CLAB</option>
							<option value="EMERGENCY">EMERGENCY</option>
							<option value="FHSH">FHSH</option>
							<option value="FRKH">FRKH</option>
							<option value="GCUH">GCUH</option>
							<option value="GCVH">GCVH</option>
							<option value="HMCR">HMCR</option>
							<option value="HNTH">HNTH</option>
							<option value="LIJH">LIJH</option>
							<option value="LXHH">LXHH</option>
							<option value="NSMG">NSMG</option>
							<option value="NSUH">NSUH</option>
							<option value="PBMC">PBMC</option>
							<option value="PLVH">PLVH</option>
							<option value="PMHC">PMHC</option>
							<option value="RAHR">RAHR</option>
							<option value="RCEB">RCEB</option>
							<option value="REPO">REPO</option>
							<option value="RHIO">RHIO</option>
							<option value="RPTN">RPTN</option>
							<option value="RSCM">RSCM</option>
							<option value="SDA">SDA</option>
							<option value="SIUH">SIUH</option>
							<option value="STHS">STHS</option>
							<option value="Validic">Validic</option>
						</select>
					</td>
				</tr>  
				<tr>

					<td><input type="submit" value="Submit"/></td>

				</tr>
			</table>
		</form>  
   </body>
</html>